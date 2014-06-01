package c.client;

import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class CorbaClientC {

    public static ServerCommunication servComm;

    public void startCorbaClient(String nameOrId) {
        try {
            // create and initialize the ORB
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            ORB orb = ORB.init((String[]) null, props);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            ResponderImpl responderImpl = new ResponderImpl();
            rootPOA.activate_object(responderImpl);
            Responder responder = ResponderHelper.narrow(rootPOA.servant_to_reference(responderImpl));

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            System.out.println((ncRef.resolve_str("exerciseC")).getClass().toString());
            servComm = ServerCommunicationHelper.narrow(ncRef.resolve_str("exerciseC"));
            servComm.register_callback("SAP AG", responder);
            
            System.out.println("I get here");
            
            rootPOA.the_POAManager().activate();
            orb.run();
            
        } catch (InvalidName | ServantAlreadyActive | WrongPolicy | ServantNotActive | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName | AdapterInactive ex) {
            System.err.println(ex);
        }
    }
}

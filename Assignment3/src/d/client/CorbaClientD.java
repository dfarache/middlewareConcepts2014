package d.client;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class CorbaClientD {
    
    public static int reply_count=0;
    
    public void startCorbaClient(String nameOrID) {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            ORB orb = ORB.init((String[]) null, props);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "exerciseD";
            Quoter qRef = QuoterHelper.narrow(ncRef.resolve_str(name));

            AMI_QuoterHandler replyHandler = new AMI_QuoterImpl("SAP AG")._this(orb);
            ((_QuoterStub) qRef).sendc_getQuote(replyHandler, "SAP AG");
            
            
                    
            while (reply_count > 0) {
                if (orb.work_pending()) {
                    orb.perform_work();
                }
            }
            
            

        } catch (InvalidName | NotFound | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName ex) {
            Logger.getLogger(CorbaClientD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

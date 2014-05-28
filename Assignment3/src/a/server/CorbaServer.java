package a.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantAlreadyActive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class CorbaServer {

    public void startCorbaServer() {
        try {

            ORB orb = ORB.init((String[]) null, null);

            org.omg.PortableServer.POA objectAdapter
                    = org.omg.PortableServer.POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            objectAdapter.the_POAManager().activate();

            //call the servant object 
            QuoterImpl stockQuote = new QuoterImpl();
            objectAdapter.activate_object(stockQuote);
            System.out.println("GET HERE");
            org.omg.CORBA.Object o = objectAdapter.servant_to_reference(stockQuote);

            PrintWriter ps = new PrintWriter(new FileOutputStream(new File("IOR_FILE")));
            ps.println(orb.object_to_string(o));
            ps.close();

            ////////////
            System.out.println("GET HERE");
            orb.run();

        } catch (InvalidName | AdapterInactive | ServantNotActive | WrongPolicy | ServantAlreadyActive ex) {
            System.err.println(ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CorbaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

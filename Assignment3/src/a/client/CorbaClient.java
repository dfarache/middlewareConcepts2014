package a.client;

import QuoterPackage.InvalidStockName;
import client.UI.ClientGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.JButton;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class CorbaClient {

    private static ClientGUI client;

    private void startCorbaCLient(String nameOrID) {

        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialPort", "22010");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("ORBInitRef", "NameService=http://localhost/~dafarache/NS_Ref");
            ORB orb = ORB.init((String[]) null, props);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the Object Reference in Naming
            Quoter quoter = QuoterHelper.narrow(ncRef.resolve_str("exerciseA"));

            
            client.getTextField().setText(String.valueOf(quoter.getQuoteByName(nameOrID)));

        } catch (InvalidStockName | InvalidName | CannotProceed | org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound e) {
            System.err.println(e);
        }
    }

    public void initializeClient() {
        client = new ClientGUI();
        client.setVisible(true);

        JButton textButton = client.getButton();
        textButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameOrID = client.getDestinationField().getText();
                startCorbaCLient(nameOrID);
            }
        });
    }
}

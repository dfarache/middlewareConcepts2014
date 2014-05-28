package a.client;

import QuoterPackage.InvalidStockName;
import client.UI.ClientGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class CorbaClient {

    private static ClientGUI client;
    private final String[] args;

    public CorbaClient(String[] args) {
        this.args = Arrays.copyOf(args, args.length);
    }

    public void startCorbaCLient(String nameOrID) {
        
        String ior = "IOR:000000000000001849444C3A612E7365727665722F51756F7465723A312E3000000000010000000000000050000102000000000E3134312E32332E3130372E363500B2BA0000001F363038303139333833352F000118284A01141628100630463814141B484C1B00000000010000000000000008000000004A414300";
        
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
        Quoter quoter = QuoterHelper.narrow(orb.string_to_object(ior));
        try {
            System.out.println(quoter.getQuoteByName("SAP AG"));
        } catch (InvalidStockName ex) {
            System.err.println(ex);
        }
    }
/*
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
    }*/
}

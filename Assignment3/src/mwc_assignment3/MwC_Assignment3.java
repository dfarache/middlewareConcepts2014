
package mwc_assignment3;


public class MwC_Assignment3 {

    public static void main(String[] args) {
        
        if(args.length < 2){
            System.out.println("Wrong parameters. Read the manual");
            System.exit(0);
        }
        
        if(args[0].equals("a")){
            if(args[1].equals("server"))
                new a.server.CorbaServer().startCorbaServer();
            if(args[1].equals("client"))
                new a.client.CorbaClient(args).startCorbaCLient(null);
        }
    }
    
}

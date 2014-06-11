package middleware_assignment4;


public class Middleware_Assignment4 {

  

    public static void main(String[] args) {
        if(args.length < 1)
            System.exit(-1);
        
        if(args[0].equals("publish"))
            new StockPublisher.StockPublisher().startPublish();
        else if(args[0].equals("subscribe"))
            new stockSubscriber.StockSubscriber().startSubscriber();
        else
            System.out.println("Command not recognized");
    }

}

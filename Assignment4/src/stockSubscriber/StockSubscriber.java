package stockSubscriber;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class StockSubscriber {

    private static TopicSession stockSubscribeSession;
    private static QueueSession stockInitSession;
    private static TopicConnection topicConn;
    private static QueueConnection queueConn;
    private static final String url = ActiveMQConnection.DEFAULT_BROKER_URL;
       
    private final List<SubscribeQuote>quotesSubscribed = new ArrayList<>();
    
    public StockSubscriber() {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
            topicConn = connectionFactory.createTopicConnection();
            queueConn = connectionFactory.createQueueConnection();
            topicConn.start();
            queueConn.start();
            stockSubscribeSession = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            stockInitSession = queueConn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }
    
    public void startSubscriber(){
        String commandIntroduced;
        
        Console cos = System.console();
        while(true){
            commandIntroduced = cos.readLine("Command>> ");
            if(commandIntroduced.equals("add")){
                String idOfStock = cos.readLine("Introduce ID of stok>> ");
                try{
                    addNewStock(idOfStock);
                }catch(StockAlreadyExistsException ex){
                    System.out.println("Already subscribed to that quote");
                }
            }
        }
    }
    
    private void addNewStock(String stockId) throws StockAlreadyExistsException{       
        for(SubscribeQuote subscription : quotesSubscribed){
            if(subscription.getSubject().equals(stockId)){
                throw new StockAlreadyExistsException("Stock already in watchlist");
            }
        }
        System.out.println(quotesSubscribed.size());
        SubscribeQuote subscribeQuote = new SubscribeQuote(stockId, stockSubscribeSession, stockInitSession);
        quotesSubscribed.add(subscribeQuote);
        
        subscribeQuote.fastInit(); 
        
        subscribeQuote.setupSubscribeQuote();
    }
    
    private class StockAlreadyExistsException extends Exception{
        private StockAlreadyExistsException(String message){
            super(message);
        }
    }
}

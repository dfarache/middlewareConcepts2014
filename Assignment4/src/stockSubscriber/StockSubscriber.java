package stockSubscriber;

import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class StockSubscriber {

    static TopicSession stockSubscribeSession;
    static QueueSession stockInitSession;
    static SubscribeQuote quoteSubscriber;
    static TopicConnection topicConn;
    static QueueConnection queueConn;
    private final String url = ActiveMQConnection.DEFAULT_BROKER_URL;

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
                
            }
        }
    }
    
    private void addNewStock(String stockId){
        SubscribeQuote subscribeQuote = new SubscribeQuote(stockId, stockSubscribeSession, stockInitSession);
    }
}

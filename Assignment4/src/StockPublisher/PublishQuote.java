package StockPublisher;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import stock.Stock;

public class PublishQuote {

    private final TopicSession topicSession;
    private final Stock stock;
    private TextMessage message;
    private TopicPublisher topicPublisher;

    public PublishQuote(TopicSession topicSession, Stock stock) {
        this.topicSession = topicSession;
        this.stock = stock;
        createTopic();
    }

    private void createTopic() {
        try {
            Topic topic = topicSession.createTopic(stock.getStockId());
            topicPublisher = topicSession.createPublisher(topic);
            message = topicSession.createTextMessage();
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    protected void publishQuote(double quote, String content) throws JMSException {
        message.setText(content);
        message.setDoubleProperty("quote", quote);
        topicPublisher.publish(message);
    }
}

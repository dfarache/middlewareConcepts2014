package stockSubscriber;

import javax.jms.*;

public class SubscribeQuote implements MessageListener{

    public String subject;
    public TopicSession topicSession;
    public QueueSession queueSession;
    public Topic topic;
    public TopicSubscriber topicSubscriber;
    public TextMessage message;

    public SubscribeQuote(String subject, TopicSession topicSession, QueueSession queueSession) {
        this.subject = subject;
        this.topicSession = topicSession;
        this.queueSession = queueSession;
    }

    public void setupSubscribeQuote() {
        try {
            createTopic();
        } catch (JMSException ex) {
            System.err.println(ex);;
        }
    }

    private void createTopic() throws JMSException {
        topic = topicSession.createTopic(subject);
        topicSubscriber = topicSession.createSubscriber(topic);
    }

    @Override
    public void onMessage(Message message) {
        
    }
}

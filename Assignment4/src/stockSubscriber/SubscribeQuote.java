package stockSubscriber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.jms.*;

public class SubscribeQuote implements MessageListener {

    private final String subject;
    private final TopicSession topicSession;
    private final QueueSession queueSession;
    private Topic topic;
    private TopicSubscriber topicSubscriber;

    private boolean initialized;

    //StockQuote Parameters
    private Date stockQuoteInstant;
    private double stockQuoteValue;

    public SubscribeQuote(String subject, TopicSession topicSession, QueueSession queueSession) {
        this.subject = subject;
        this.topicSession = topicSession;
        this.queueSession = queueSession;

        this.initialized = false;
    }

    public void setupSubscribeQuote() {
        try {
            createTopic();
            topicSubscriber.setMessageListener(this);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    private void createTopic() throws JMSException {
        topic = topicSession.createTopic(subject);
        topicSubscriber = topicSession.createSubscriber(topic);
    }

    public void fastInit() {
        try {
            Destination dest = queueSession.createQueue("messageRequest");
            MessageProducer requestProducer = queueSession.createProducer(dest);
            requestProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            
            Destination tempDest = queueSession.createTemporaryQueue();
            MessageConsumer responseConsumer = queueSession.createConsumer(tempDest);

            responseConsumer.setMessageListener(this);
            TextMessage tempTxt = queueSession.createTextMessage();
            tempTxt.setText(subject);
            tempTxt.setJMSReplyTo(tempDest);
            String correlationID = this.createRandomString();
            tempTxt.setJMSCorrelationID(correlationID);
            requestProducer.send(tempTxt);
        } catch (JMSException ex) {
            System.err.println(ex);
        }
    }

    private String createRandomString() {
        Random random = new Random(System.currentTimeMillis());
        long randomLong = random.nextLong();
        return Long.toHexString(randomLong);
    }

    @Override
    public void onMessage(Message message) {
        TextMessage textMsg;
        String temp;
        if (message instanceof TextMessage) {
            textMsg = (TextMessage) message;
            try {
                temp = textMsg.getText();
                parseMessage(temp);

                System.out.print("\n [Subscriber] " + subject + "\n\t\t");
                System.out.printf("%.2f", stockQuoteValue);
                System.out.println("\t\t| " + stockQuoteInstant);

                if (message.getJMSType() != null && message.getJMSType().equals("Init")) {
                    this.initialized = true;
                }

            } catch (JMSException ex) {
                System.err.println(ex);
            }
        }

    }

    public void parseMessage(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        String[] messageContent;

        try {
            messageContent = msg.split(":");
            stockQuoteInstant = dateFormat.parse(messageContent[1]);
            stockQuoteValue = Float.parseFloat(messageContent[0]);
        } catch (ParseException ex) {
            System.err.println(ex);
        }

    }

    public String getSubject() {
        return this.subject;
    }
}

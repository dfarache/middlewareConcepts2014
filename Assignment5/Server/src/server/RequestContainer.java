package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RequestContainer extends Thread {

    private final Socket socket;
    private final long initTime;
    private String fileName;
    private String methodName;
    private long fileSize;
    private final double pricePerSecond = 3.2;

    public RequestContainer(Socket socket) {

        this.socket = socket;
        this.initTime = System.currentTimeMillis();
    }

    @Override
    public void start() {
        rcvRequest();
        Object returnValue = loadJobAndGetReturnValue();
        sendAnswer(returnValue);
    }

    private void rcvRequest() {
        try {
            ObjectInputStream objInput = new ObjectInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            this.fileName = (String) objInput.readUTF();

            if (fileName.endsWith(".class")) {
                processByteCode(objInput);
            }
            if (fileName.endsWith(".java")) {
                processSourceCode(objInput);
            }
            //objInput.close();
            System.out.println(socket.isClosed());
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void processByteCode(ObjectInputStream objInput) {
        try (BufferedOutputStream buffOut = new BufferedOutputStream(
                new FileOutputStream("test_classes/" + fileName))) {
            this.fileSize = objInput.readLong();
            this.methodName = objInput.readUTF();
            for (int i = 0; i < fileSize; i++) {
                buffOut.write(objInput.read());
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void processSourceCode(ObjectInputStream objInput) {

    }

    //http://www.mkyong.com/java/how-to-use-reflection-to-call-java-method-at-runtime/
    private Object loadJobAndGetReturnValue() {
        Object ans = null;
        try {
            Class jobClass = Class.forName("test_classes." + fileName.split(".class")[0]);
            ans = new Job(jobClass, methodName, null).executeMethod();
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
        return ans;
    }

    private void sendAnswer(Object obj) {
        try (
                ObjectOutputStream objOut = new ObjectOutputStream(
                        new BufferedOutputStream(socket.getOutputStream()));) {
                    objOut.writeObject(obj);
                    objOut.writeDouble(getBill());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }

    private double getBill() {
        double timeSpent = (double) (System.currentTimeMillis() - this.initTime) / 1000;
        return (timeSpent * this.pricePerSecond);
    }
}

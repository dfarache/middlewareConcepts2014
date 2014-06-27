package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;

public class RequestContainer extends Thread {

    private final Socket socket;
    private double billingInfo;
    private final long initTime;
    private String fileName;
    private long fileSize;

    public RequestContainer(Socket socket) {
        this.socket = socket;
        this.billingInfo = 0.0;
        this.initTime = System.currentTimeMillis();
    }

    @Override
    public void start() {
        rcvRequest();
        loadJob();
    }

    private void rcvRequest() {
        try (ObjectInputStream objInput = new ObjectInputStream(
                new BufferedInputStream(socket.getInputStream()))) {

            this.fileName = (String) objInput.readUTF();

            if (fileName.endsWith(".class")) {
                processByteCode(objInput);
            }
            if (fileName.endsWith(".java")) {
                processSourceCode(objInput);
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void processByteCode(ObjectInputStream objInput) throws IOException {
        this.fileSize = objInput.readLong();
        System.out.println(this.fileSize);
        BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream("test_classes/" + fileName));

        for (int i = 0; i < fileSize; i++) {
            buffOut.write(objInput.read());
        }
        buffOut.close();
    }

    private void processSourceCode(ObjectInputStream objInput) {

    }

    private void loadJob() {
        try{
            Class jobClass = Class.forName("test_classes."+fileName.split(".class")[0]);
            Job job = new Job(jobClass);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}

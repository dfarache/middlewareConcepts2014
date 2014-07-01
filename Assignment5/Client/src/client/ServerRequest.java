package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerRequest extends Thread {

    private final File file;
    private Object object;
    private final String methodName;
    private final Socket socket;

    ServerRequest(File file, Object object, String methodName, Socket socket) {
        this.file = file;
        this.object = object;
        this.methodName = methodName;
        this.socket = socket;
    }

    @Override
    public void start() {
        sendRequestToServer();
        readAnswerFromServer();
    }

    private void sendRequestToServer() {
        try {
            ObjectOutputStream objout = new ObjectOutputStream(
                    new BufferedOutputStream(socket.getOutputStream()));
            BufferedInputStream buffIn = new BufferedInputStream(
                    new FileInputStream(file));
            sendParamsToServer(objout, buffIn);
            buffIn.close();
            objout.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void sendParamsToServer(ObjectOutputStream objout, BufferedInputStream buffIn) throws IOException {
        long fileSize = file.length();
        objout.writeUTF(file.getName());
        objout.writeLong(fileSize);
        objout.writeUTF(methodName);
        objout.flush();
        for (int i = 0; i < fileSize; i++) {
            objout.write(buffIn.read());
        }
        sendObject(objout);
    }

    private void sendObject(ObjectOutputStream objout) throws IOException {
        if (this.object == null) {
            objout.writeBoolean(false);
        } else {
            objout.writeBoolean(true);
            objout.writeObject(this.object);
        }
    }

    private void readAnswerFromServer() {
        try {
            ObjectInputStream objIn = new ObjectInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            Object answer = objIn.readObject();
            double price = objIn.readDouble();
            this.object = objIn.readObject();
            
            if(this.object==null)
                printRequestFromServer(answer, price);
            
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    private void printRequestFromServer(Object answer, double price) {
        System.out.println("Answer from server: " + (String) answer + "\n"
                + "price charged: " + price);
    }
    
    public Object getObject(){
        return this.object;
    }
}

package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private final Socket socket;
    private final int port = 22011;

    public Client() throws IOException {
        socket = new Socket("127.0.0.1", port);
    }

    public void startClient() {
        //The client will call several jobs to be executed
        testHelloWorld();
    }

    private void testHelloWorld() {
        File helloWorld = new File("./test_classes/TestHelloWorld.class");
        String methodName = "helloWorld";

        new ServerRequest(helloWorld, null, methodName).start();

    }

    public static void main(String[] args) {
        try {
            new Client().startClient();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private class ServerRequest extends Thread {

        private final File file;
        private final Object object;
        private final String methodName;

        private ServerRequest(File file, Object object, String methodName) {
            this.file = file;
            this.object = object;
            this.methodName = methodName;
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
                System.out.println(ex);
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
        }

        private void readAnswerFromServer() {
            try (
                    ObjectInputStream objIn = new ObjectInputStream(
                            new BufferedInputStream(socket.getInputStream()))) {
                        Object answer = objIn.readObject();
                        double price = objIn.readDouble();
                        printRequestFromServer(answer, price);
                    } catch (IOException | ClassNotFoundException ex) {
                        System.err.println(ex);
                    }
        }

        private void printRequestFromServer(Object answer, double price) {
            System.out.println("Answer from server: " + (String) answer + "\n"
                    + "price charged: " + price);
        }

        @Override
        public void start() {
            sendRequestToServer();
            readAnswerFromServer();
        }
    }
}

package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
        if (helloWorld.exists()) {
            new ServerRequest(helloWorld, null).start();
        }
    }
    
    public static void main(String[]args){
        try{
            new Client().startClient();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }

    private class ServerRequest extends Thread {

        private final File file;
        private final Object object;

        private ServerRequest(File file, Object object) {
            this.file = file;
            this.object = object;
        }

        private void sendRequestToServer() {
            try (ObjectOutputStream objout = new ObjectOutputStream(
                    new BufferedOutputStream(socket.getOutputStream()));
                    BufferedInputStream buffIn = new BufferedInputStream(
                            new FileInputStream(file));) {

                long fileSize = file.length();
                //we send the parameters to the server
                objout.writeUTF(file.getName());
                objout.writeLong(fileSize);
                objout.flush();
                for (int i = 0; i < fileSize; i++) {
                    objout.write(buffIn.read());
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        @Override
        public void start() {
            sendRequestToServer();
        }
    }
}

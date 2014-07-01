package client;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import test_classes.TestObject;

public class Client {

    private final int port = 22011;

    public void startClient() {
        //The client will call several jobs to be executed
        try {
            testHelloWorld();
            sleep();
            testObject();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void testHelloWorld() throws IOException {
        System.out.println("[CLIENT]\t 1st test: HelloWorld");
        File helloWorld = new File("./test_classes/TestHelloWorld.class");
        String methodName = "helloWorld";
        Socket socket = new Socket("127.0.0.1", port);
        new ServerRequest(helloWorld, null, methodName, socket).start();
        System.out.println("\n\n");
    }

    private void testObject() throws IOException {
        System.out.println("[CLIENT]\t 2nd test: sending an object and src code");
        File testObject = new File("./test_classes/TestObject.java");
        String methodName = "increaseParams";
        TestObject objectToTest = new TestObject();
        System.out.println(objectToTest.toString());
        Socket socket = new Socket("127.0.0.1", port);
        ServerRequest srv = new ServerRequest(testObject, objectToTest, methodName, socket);
        srv.start();
        System.out.println("[CLIENT]\t Object sent to server");
        objectToTest = (TestObject) srv.getObject();
        System.out.println(objectToTest.toString());
        System.out.println("\n\n\n");
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Client().startClient();
    }
}

package Lesson17;

import org.apache.log4j.Logger;

import java.io.StringReader;

public class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class);

    public static void main(String[] args) {
     //  LOGGER.debug("some message");
        System.out.println("logger has started");
        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();
        Thread mySecondThread = new Thread(new MySecondThread());
        mySecondThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("поток main печатает " + i);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

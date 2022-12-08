package FromYoutube;

import java.util.Scanner;

public class SelfPrint {
    public static void main(String[] args) throws InterruptedException{
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

//        System.out.println("i am going to sleep");
//        Thread.sleep(3000);
//        System.out.println("i am awake");
 /**       Thread thread = new Thread(new Runner());
        thread.start();

    }
}*/
 MyThread myThread = new MyThread();
 myThread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.shutdown();
    }
}
class MyThread extends Thread{
    private volatile boolean running = true;
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}


/**class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello myThread " + i);

        }
    }
}
   class MyThread extends Thread{
        public void run(){
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello myThread " + i);

            }
        }

   }*/




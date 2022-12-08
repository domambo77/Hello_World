package Lesson17;

public class MySecondThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i < 1030; i++) {
            System.out.println("Thread MySecondThread print " + i);

            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

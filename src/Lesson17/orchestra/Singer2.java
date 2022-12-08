package Lesson17.orchestra;

public class Singer2 extends Thread{
    @Override
    public void run() {

        while (true){
            synchronized (Monitor.MICROPHONE){
                try {
                    Monitor.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("dadada----------------------");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitor.MICROPHONE){
                Monitor.MICROPHONE.notify();
            }
        }
    }
}

package Lesson17.orchestra;

public class Singer1 extends Thread {

    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
         while (!needStop){

             for (int i = 0; i < 3; i++) {

                 if (count > 2){
                     needStop = true;
                     System.out.println("---------------------------lalala");
                 }

             }count++;

                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             synchronized (Monitor.MICROPHONE){
                 Monitor.MICROPHONE.notify();
             }
        synchronized (Monitor.MICROPHONE){
            try {
                Monitor.MICROPHONE.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         }
    }


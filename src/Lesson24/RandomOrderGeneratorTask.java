package Lesson24;

import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    private List<Tablet> tablets;
    private int interval;
    public RandomOrderGeneratorTask(List<Tablet> tablets, int interval){
        this.tablets = tablets;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            int number = (int) (Math.random() * tablets.size());
            tablets.get(number).createTestOrder();
            try {
                Thread.sleep(interval);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

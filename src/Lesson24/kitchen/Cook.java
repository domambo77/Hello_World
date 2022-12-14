package Lesson24.kitchen;

import Lesson24.ConsoleHelper;
import Lesson24.statistic.StatisticEventManager;
import Lesson24.statistic.event.CookedOrderEventDataRow;

import java.util.Date;
import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable {
    private final String name;
    private boolean busy;
    private LinkedBlockingQueue<Order> queue;

    public Cook(String name) {
        this.name = name;
    }

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public boolean isBusy(){
        return busy;
    }


    public void startCookingOrder(Order order) {
        busy = true;
      //  Order order = (Order) arg;
        ConsoleHelper.writeMessage("Start cooking " + order);
        setChanged();
        notifyObservers(order);
        CookedOrderEventDataRow row = new CookedOrderEventDataRow(order.getTablet().toString(), name,
                order.getTotalCookingTime(), order.getDishes(), new Date());
        StatisticEventManager.getInstance().register(row);
        try {
            Thread.sleep(order.getTotalCookingTime() * 10L);
        }catch (InterruptedException e){

        }

        busy = false;
    }

    @Override
    public String toString() {
        return "Cook name = " + name;
    }

   @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            if (!queue.isEmpty()){
                Order order = queue.poll();
                if (order != null){
                    this.startCookingOrder(order);
                }
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
}

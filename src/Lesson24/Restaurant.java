package Lesson24;

import Lesson24.kitchen.Cook;
import Lesson24.kitchen.Order;
import Lesson24.kitchen.Waiter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;
    private static final LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();
    public static void main(String[] args) {
        List<Tablet> tablets = new ArrayList<>();

        Cook cook1 = new Cook(" Nikolay ");
        cook1.setQueue(orderQueue);
        Cook cook2 = new Cook("Artem");
        cook2.setQueue(orderQueue);
        Waiter waiter = new Waiter();

        cook1.addObserver(waiter);
        cook2.addObserver(waiter);



        for (int i = 1; i < 5; i++) {
            Tablet tablet = new Tablet(i);
            tablet.setQueue(orderQueue);
            tablets.add(tablet);
        }



        RandomOrderGeneratorTask randomOrderGeneratorTask = new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL);
        Thread cookThread = new Thread(randomOrderGeneratorTask);
        cookThread.start();

        Thread cook1Thread = new Thread((Runnable) cook1);
        cook1Thread.start();
        Thread cook2Thread = new Thread((Runnable) cook2);
        cook2Thread.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }cookThread.interrupt();

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkLoading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }

}

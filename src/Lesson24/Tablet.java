package Lesson24;

import Lesson24.ad.AdvertisementManager;
import Lesson24.ad.NoVideoAvailableException;
import Lesson24.kitchen.Order;
import Lesson24.kitchen.TestOrder;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tablet {
    private final int number;
    private final Logger logger = Logger.getLogger(Tablet.class.getName());
    private LinkedBlockingQueue<Order> queue;

    public Tablet(int number) {
        this.number = number;
    }
    public void setQueue(LinkedBlockingQueue<Order> queue){
        this.queue = queue;
    }
    public void createOrder (){
        Order order = null;
        try {
            order = new Order(this);
            //setChanged();
         //   notifyObservers(order);
            ConsoleHelper.writeMessage(order.toString());
            if (!order.isEmpty()){
                queue.put(order);
            AdvertisementManager advertisementManager = new AdvertisementManager(order.getTotalCookingTime()*60);
            advertisementManager.processVideos();}
        } catch (IOException e) {
            logger.log(Level.SEVERE,"Console is not available");
        }catch (NoVideoAvailableException e){
           logger.log(Level.INFO, "No video is available for the order " + createTestOrder());
        }catch (InterruptedException e){}


    }
    public TestOrder createTestOrder(){
        TestOrder order = null;
        try {
            order = new TestOrder(this);
            //setChanged();
           // notifyObservers(order);
            AdvertisementManager advertisementManager = new AdvertisementManager(order.getTotalCookingTime()*60);
            advertisementManager.processVideos();
        } catch (Exception e) {
            logger.log(Level.SEVERE,"Console is not available");
        }

        return order;
    }

    @Override
    public String toString() {
        return " Tablet number = " + number;
    }

}

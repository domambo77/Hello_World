package Lesson24;

import Lesson24.ad.AdvertisementManager;
import Lesson24.kitchen.Order;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Tablet extends Observable {
    private final int number;
    private final Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }
    public Order createOrder(){
        Order order = null;
        try {
            order = new Order(this);
            setChanged();
            notifyObservers(order);
            ConsoleHelper.writeMessage("You order " + order);
            AdvertisementManager advertisementManager = new AdvertisementManager(order.getTotalCookingTime()*60);
            advertisementManager.processVideos();
        } catch (Exception e) {
            logger.log(Level.SEVERE,"Console is not available");
        }

        return order;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}

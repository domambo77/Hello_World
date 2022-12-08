package Lesson24;

import Lesson24.kitchen.Order;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Tablet {
    private final int number;
    private final Logger logger = Logger.getLogger(Tablet.class);

    public Tablet(int number) {
        this.number = number;
    }
    public void createOrder(){
        Order order;
        try {
            order = new Order(this);
        } catch (Exception e) {
            logger.warn(Level.WARN);
            logger.warn("Console is not available");
        }

    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}

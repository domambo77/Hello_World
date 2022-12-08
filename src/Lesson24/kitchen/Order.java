package Lesson24.kitchen;

import Lesson24.ConsoleHelper;
import Lesson24.Tablet;

import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> diches;

    public Order(Tablet tablet) {
        this.tablet = tablet;
        this.diches = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        return "Order{" +
                "tablet=" + tablet +
                ", diches=" + diches +
                '}';
    }
}

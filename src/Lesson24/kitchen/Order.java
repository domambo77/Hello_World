package Lesson24.kitchen;

import Lesson24.ConsoleHelper;
import Lesson24.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public List<Dish> getDishes(){
        return dishes;
    }
    public Tablet getTablet(){
        return tablet;
    }
    public int getTotalCookingTime(){
        return dishes.stream()
                .map(Dish::getDuration)
                .reduce(Integer::sum).get();
    }
    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        return "Order{" +
                "tablet=" + tablet +
                ", dishes=" + dishes +
                "getTotalCookingTime()" + getTotalCookingTime()+ "min" +
                '}';
    }
}

package Lesson24.kitchen;

import Lesson24.Tablet;

import java.io.IOException;
import java.util.ArrayList;

public class TestOrder extends Order {

    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }
    @Override
    protected void initDishes() {
        dishes = new ArrayList<>();
        int len = (int) (Math.random() * Dish.values().length);
        for (int i = 0; i < len; i++) {
            int random = (int) (Math.random() * Dish.values().length);
            dishes.add(Dish.values()[random]);
        }

        }

    }


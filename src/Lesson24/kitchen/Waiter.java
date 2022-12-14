package Lesson24.kitchen;

import Lesson24.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(cook + " make your order " + order);
    }
}

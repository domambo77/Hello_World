package Lesson24;

import Lesson24.kitchen.Cook;
import Lesson24.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(1);
        Cook cook = new Cook("Nikolay");
        Waiter waiter = new Waiter();

        cook.addObserver(waiter);
        tablet.addObserver(cook);

        tablet.createOrder();






        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkLoading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}

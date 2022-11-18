package Lesson17;

import java.util.ArrayList;
import java.util.List;

public class Home_Work {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) throws InterruptedException {
        /** 1
         В методе main добавить в статический объект list 5 нитей.
         Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.*/
        Thread thread = new Thread(new SpecialThread());
        thread.start();
        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));

        }

        /** 2
         1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
         2. SpecialThread должен выводить в консоль свой стек-трейс.

         Подсказка: main thread уже выводит в консоль свой стек-трейс.*/

        Thread thread_1 = new Thread(new SpecialThread_1());
        thread_1.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }


    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }

    public static class SpecialThread_1 implements Runnable {
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}


















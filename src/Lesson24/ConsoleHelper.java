package Lesson24;

import Lesson24.kitchen.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHelper {
    private static Scanner scanner = new Scanner(System.in);
    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString(){

       return scanner.nextLine();
    }
    public static List<Dish> getAllDishesForOrder(){
        List<Dish>dishes = new ArrayList<>();
        writeMessage(" Выбери блюда из меню: ");
        System.out.println(Dish.allDishesToString());
        writeMessage("При завершении заказа введите  exit");
        while (!readString().equals("exit")){
            String dishName = readString();
            try{
            Dish dish = Dish.valueOf(dishName);
            dishes.add(dish);
            writeMessage(dishName + "успешно добавлено");
        }catch (IllegalArgumentException e){
                writeMessage(dishName + "такого блюда у нас нет");
            }
        }
        return dishes;
    }
}

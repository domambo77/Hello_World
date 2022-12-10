package Lesson24;

import Lesson24.kitchen.Dish;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHelper {
    private static final Scanner scanner = new Scanner(System.in);
    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString(){

       return scanner.nextLine();
    }
   /** public static List<Dish> getAllDishesForOrder(){
        List<Dish>dishes = new ArrayList<>();
        writeMessage(" Выбери блюда из меню: ");
        System.out.println(Dish.allDishesToString());
        writeMessage("При завершении заказа введите  exit");
        while (true){

            if ("exit" equals(dishName)){
                break;
            }
            String dishName = readString();
            try{
            Dish dish = Dish.valueOf(dishName);
            dishes.add(dish);
            writeMessage(dishName + " успешно добавлено");
        }catch (Exception e){
                writeMessage(dishName + " такого блюда у нас нет");
            }
        }
        return dishes;
    }*/
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        ConsoleHelper.writeMessage("Please choose a dish from the list:" + Dish.allDishesToString() +
                "\n or type 'exit' to complete the order");
        while (true) {
            String dishName = ConsoleHelper.readString().trim();
            if ("exit".equals(dishName)) {
                break;
            }

            try {
                Dish dish = Dish.valueOf(dishName);
                dishes.add(dish);
                writeMessage(dishName + " has been successfully added to your order");
            } catch (Exception e) {
                writeMessage(dishName + " hasn't been detected");
            }
        }

        return dishes;
    }
}

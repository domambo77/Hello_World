package Lesson16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


    /** 1
     1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
     2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
     3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
     4. Вывести содержимое Map на экран.*/

        Map<String, String> map = new HashMap<>();

        map.put("иванов", "петр");
        map.put("петров", "иван");
        map.put("васильев", "игорь");
        map.put("васильев", "дима");
        map.put("сергеев", "леха");
        map.put("дмитриев", "леха");
        map.put("сивуха", "сергей");
        map.put("иванов", "сергей");
        map.put("владимиров", "вася");
        map.put("викторов", "виктор");

        for ( Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println();




     /**2
     Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
     Используй коллекции.*/

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> month = new HashMap<>();
        System.out.println("Введите имя месяца по английски с большой буквы: ");

        month.put("Junuary", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);


        String yourMonth = scanner.nextLine();
        for (Map.Entry<String, Integer> pair : month.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(yourMonth)) {
                System.out.println(key + " is the " + value + " month");
            }
        }

    /** 3
     Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
     Новая задача: Программа должна работать не с номерами домов, а с городами:

     Пример ввода:
     Москва
     Ивановы
     Киев
     Петровы
     Лондон
     Абрамовичи

     Лондон

     Пример вывода:
     Абрамовичи*/
        Map<String,String> addresses = new HashMap<>();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите название города по русски: Москва,Лондон,Саратов,Питер,Хантымансийск");

            addresses.put("Москва", "ивановы");
            addresses.put("Лондон", "абрамовичи");
            addresses.put("Саратов", "петровы");
            addresses.put("Питер", "воронцовы");
            addresses.put("Хантымансийск", "васнецовы");

        String myCity = scanner1.nextLine();
        for (Map.Entry<String, String> town: addresses.entrySet()) {
            String town_i = town.getKey();
            if (myCity.equals(town_i)) {
                System.out.println(town.getValue());
            }
        }

    /** 4
     Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
     арбуз - ягода,
     банан - трава,
     вишня - ягода,
     груша - фрукт,
     дыня - овощ,
     ежевика - куст,
     жень-шень - корень,
     земляника - ягода,
     ирис - цветок,
     картофель - клубень.
     Вывести содержимое коллекции на экран, каждый элемент с новой строки.

     Пример вывода (тут показана только одна строка):
     картофель - клубень*/
        Map<String, String> grossery = new HashMap<>();

        grossery.put("арбуз", "ягода");
        grossery.put("банан", "трава");
        grossery.put("вишня", "ягода");
        grossery.put("груша", "фрукт");
        grossery.put("дыня", "овощ");
        grossery.put("ежевика", "куст");
        grossery.put("жень-шень", "корень");
        grossery.put("земляника", "ягода");
        grossery.put("ирис", "цветок");
        grossery.put("картофель", "клубень");

        for ( Map.Entry<String, String> e : grossery.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();

     /** 5
     Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
     Вывести содержимое коллекции на экран, каждый элемент с новой строки.

     Пример вывода (тут показана только одна строка):
     Sim - 5

     public static void main(String[] args) {
     Map<String, Object> map = new HashMap<>();
     map.put("Sim", 5);
     map.put("Tom", 5.5);
     map.put("Arbus", false);
     map.put("Baby", null);
     map.put("Cat", "Cat");
     map.put("Eat", new Long(56));
     map.put("Food", new Character('3'));
     map.put("Gevey", '6');
     map.put("Hugs", 111111111111L);
     map.put("Comp", (double) 123);

     //напишите тут ваш код

     }
     * */
        HashMap<String, Object> maps = new HashMap<String, Object>();
        maps.put("Sim", 5);
        maps.put("Tom", 5.5);
        maps.put("Arbus", false);
        maps.put("Baby", null);
        maps.put("Cat", "Cat");
        maps.put("Eat", new Long(56));
        maps.put("Food", new Character('3'));
        maps.put("Gevey", '6');
        maps.put("Hugs", 111111111111L);
        maps.put("Comp", (double) 123);


        for (Map.Entry<String, Object> pair : maps.entrySet())
        {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
}

    }


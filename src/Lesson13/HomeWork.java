package Lesson13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


        /** 1
         1. Создай список строк.
         2. Добавь в него 5 различных строк.
         3. Выведи его размер на экран.
         4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.*/

      /**  ArrayList<String> str = new ArrayList<>();
        str.add("Masha ");
        str.add("Ball ");
        str.add("Stream ");
        str.add("Car ");
        str.add("Mouse ");
        System.out.println("Размер списка " + str.size() + " элементов");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println();


        /** 2
         1. Создай список строк.
         2. Считай с клавиатуры 5 строк и добавь в список.
         3. Используя цикл, найди самую длинную строку в списке.
         4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.*/
      /**  Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите значения 5 строк: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
         int longStr = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longStr)
                longStr = list.get(i).length();
        }
        for (int i = 0; i < list.size() ; i++) {
            if(longStr == list.get(i).length())
            // System.out.println(list.get(i));


       System.out.println("Строка(строки) " +  " " + list.get(i) + " " + "самая(самые) длинная(длинные). ");}
        System.out.println();


            /** 3
             1. Создай список строк.
             2. Считай с клавиатуры 5 строк и добавь в список.
             3. Используя цикл, найди самую короткую строку в списке.
             4. Выведи найденную строку на экран.
             5. Если таких строк несколько, выведи каждую с новой строки.*/

       /** Scanner scan = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(5);
        System.out.println("Введите значения 5 строк: ");
        for (int i = 0; i < 5; i++) {
            arr.add(scan.nextLine());
        }
        int shortStr = arr.get(0).length();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() < shortStr)
                shortStr = arr.get(i).length();
        }
        for (int i = 0; i < arr.size() ; i++) {
            if (shortStr == arr.get(i).length())
                System.out.println("Строка(строки) " + " " + arr.get(i) + " " + "самая(самые) короткая(короткие). ");
        }
         /** 4
         1. Создай список строк в методе main.
         2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
         3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.*/

        /** Scanner scan1 = new Scanner(System.in);
        ArrayList<String> arr1 = new ArrayList<>(10);
        System.out.println("Введите значения 10 строк: ");
        for (int i = 0; i < 10; i++) {
            String b = scan1.nextLine();
            arr1.add(0,b);
        }for (int i = 0; i < arr1.size() ; i++) {
            System.out.println(arr1.get(i));
        }


            /** 5
             1. Создай список строк.
             2. Добавь в него 5 строк с клавиатуры.
             3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
             4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.*/
        /**Scanner scany = new Scanner(System.in);
        ArrayList<String> arrey = new ArrayList<>(5);
        System.out.println("Введите значения 5 строк: ");
        for (int i = 0; i < 5; i++) {
            String c = scany.nextLine();
            arrey.add(c);
        }
        for (int j = 0; j < 13; j++) {
            String c = arrey.get(arrey.size()-1);
            arrey.remove(arrey.size()-1);
            arrey.add(0,c);
        }
        for (int n = 0; n < arrey.size(); n++) {
            System.out.println(arrey.get(n));
        }
        System.out.println(arrey);

            /** 6
             1. Создай список строк.
             2. Добавь в него 10 строчек с клавиатуры.
             3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
             Если таких строк несколько, то должны быть учтены самые первые из них.
             4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/
        /** Scanner scanner1 = new Scanner(System.in);
        ArrayList<String>array1 = new ArrayList<>();
        System.out.println("Введите значения 10 строк: ");
        array1.add(scanner1.nextLine());
        int max = array1.get(0).length();
        int min = array1.get(0).length();
        int minShort = 0;
        int maxLong = 0;
        for (int i = 0; i < 10; i++) {
            array1.add(scanner1.nextLine());
            if (array1.get(i).length() > max){
                max = array1.get(i).length();
                maxLong = i;
            }
        }
        if (minShort >= maxLong){
            System.out.println("Длинная строка " + array1.get( maxLong));
        }else {
            System.out.println("Короткая строка " + array1.get(minShort));
        }
            /** 7
             1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
             Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
             Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
             Порядок объявления списков очень важен.
             1.1 Создай метод printList
             2. Метод printList должен выводить на экран все элементы списка с новой строки.
             3. Используя метод printList выведи эти три списка на экран.
             Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите 20 чисел: ");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listAliquot3 = new ArrayList<>();
        ArrayList<Integer> listAliquot2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(scanner2.nextInt());
        }
        for (Integer i:list) {
            if (i % 3 == 0 && i % 2 == 0){
                listAliquot2.add(i);
                listAliquot3.add(i);
               }
            else if (i % 3 == 0)
                listAliquot3.add(i);
            else if (i % 2 == 0)
                listAliquot2.add(i);
            else
                listOther.add(i);
        }
        System.out.println("Числа кратные 3: ");
        printList(listAliquot3);
        System.out.println();
        System.out.println("Числа кратные 2: ");
        printList(listAliquot2);
        System.out.println();
        System.out.println("Остальные числа");
        printList(listOther);
    }
    public static void printList(List<Integer> list)
    {        for (Integer i : list){
            System.out.println(i);
        }
    }
}




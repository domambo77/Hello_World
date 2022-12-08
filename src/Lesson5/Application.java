package Lesson5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        int[] arr1 = {5, 7, 10};

        // Массивы
        // 1 - Заполнение происходит данными одного типа
        int firstSlot = arr1[0];
        int secondSlot = arr1[1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }

        //2 - Индексация
        int []arr2 = new int[5];
        System.out.println("задача1. наполнение массива");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;



        }

        System.out.println("Task2. print only even  numbers from array");

        int [] arr3 = {12,3,15,10,8,5,30,17,14,11};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                System.out.println(arr3[i] + " ");
            }

        }
        /**
         foreach удобен тем, что проходит просто по всем значениям слева на право по каждой ячейке. Индексы не нужны!
         for(Тип переменной,  называем саму переменную: имя массива ) {
         Выполняемый код
         }
         * */

        for (int i : arr3 ){
            System.out.println(i);
        }

        System.out.println(" Task3. add slots to array from 0 to 100 dividable by 5 ");

        int [] array = new int[100];
        int number = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0){
                array[count] = i;
                count ++;
                System.out.println(i + " ");
            }
        }

        System.out.println("Task 4. count citizens on even and odd sides of street ");

        Scanner scanner = new Scanner(System.in);
        System.out.println( "input:");

        int []street = new int[10];
        for (int i = 0; i < 10; i++) {
            street[i] = scanner.nextInt();
        }
        int even = 0;
        int odd = 0;

        for (int i = 0; i < street.length; i++) {
            if (i % 2 ==0){
                even += street[i];
                            }else{
                odd += street[i];
            }

        }
        if (even > odd){
            System.out.println("On even side of street lives more people : " + even);
        }else{
            System.out.println("On odd side of street lives more people : " + odd);
        }





    }
}

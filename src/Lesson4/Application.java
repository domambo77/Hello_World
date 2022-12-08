package Lesson4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /**  // System.out.println();
         Scanner scanner = new Scanner(System.in);
         //int s = scanner.nextInt();

         System.out.println("проверить число, которое приходит с консоли положительное или отрицательое");
         System.out.println("введите число:");
         int number = scanner.nextInt();

         if (number > 0){
         System.out.println("число положительное");}
         else if (number == 0) {
         System.out.println(" это ноль");
         } else {
         System.out.println(" это отрицательное число");
         }*/

        /** циклы
         * fori, foreach, while
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World !");
        }
        System.out.println();
        System.out.println("вывести все четные числа от 1 до 40");

        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(" вывести все числа от 100 до 150, которые делятся на 3 и на 5 одновременно");

        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("вывести все числа от 10 до 0");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            System.out.println();
        }
        System.out.println(" summarize all from 10 to 20");
        int num = 0;
        for (int i = 10; i <= 20; i++) {
            num += i;
        }
        System.out.print(num + " ");
        System.out.println();

        System.out.println("print all numbers from 10 to 40, skip all numbers from 15 to 20");

        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i > 20) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("summarize all numbers divided by 2 from 10 to 50");

        int number = 0;
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                number += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(number);


        /**
         * while (условие выхода из цикла){
         * алгоритм}
         */
        int i = 3;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

       Scanner scanner = new Scanner(System.in);
        /**while (scanner.hasNext()) {
            if (scanner.nextLine().equals("/exit"))
                break;*/

        System.out.println(" print all numbers from 0 to 10");
        int i1 = 0;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" get number from console and print 'Hello World' times that equals number");

        int num3 = scanner.nextInt();
        System.out.println(" введите число:");
        while (num3 >= 0){
            System.out.println("Hello World");
            num3--;
        }
    }
}





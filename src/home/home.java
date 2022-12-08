package home;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {


        /** Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 50 до 100: ");
        while (input.hasNextInt()) {
            int number = input.nextInt();
            if (number < 50 || number > 100) {
                System.out.println("Число не в интервале {50-100}");
            } else if (number >= 50) {
                System.out.println("50-100");*/


               /** int number1 = 7;

                if (number1 < 5) {
                    System.out.println(" число меньше 5 ");
                } else if (number1 > 5) {
                    System.out.println(" число больше 5");
                } else {
                    System.out.println("число равно 5");
                }*/


        /**Scanner input1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12: ");
        while (input1.hasNextInt()) {
            int number1 = input1.nextInt();
            if (number1 < 1 || number1 > 12) {
                System.out.println(" такого месяца нет {1-12}");
            } else if (number1 <= 2) {
                System.out.println(" зима");
            } else if (number1 <= 5) {
                System.out.println("весна");
            } else if (number1 <= 8) {
                System.out.println("лето");
            } else if (number1 <= 11) {
                System.out.println(" осень ");
            } else if (number1 == 12) {
                System.out.println("тоже зима ");
            }*/


        /**Scanner input1 = new Scanner(System.in);
        System.out.println("Введите число : ");
        while (input1.hasNextInt()) {
            int number1 = input1.nextInt();
            if (number1 > 1) {
                System.out.println(number1 * 2);
            } else if (number1 < 1) {
                System.out.println(++number1 );
            } else if (number1 == 0) {
                System.out.println(" 0 ");
            }*/


       /** Scanner input1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 :  ");
        while (input1.hasNextInt()) {
            int number1 = input1.nextInt();
            if (number1 == 1) {
                System.out.println(" понедельник ");
            } else if (number1 == 2) {
                System.out.println(" вторник ");
            } else if (number1 == 3) {
                System.out.println("среда ");
            } else if (number1 == 4) {
                System.out.println(" четверг ");
            } else if (number1 == 5) {
                System.out.println(" пятница ");
            } else if (number1 == 6) {
                System.out.println(" суббота ");
            } else if (number1 == 7) {
                System.out.println(" восскресенье ");
            } else {
                System.out.println(" нет такого дня");
            }*/

        /**Scanner input2 = new Scanner(System.in);
        System.out.println("Введите год :  ");
        while (input2.hasNextInt()) {
            int year = input2.nextInt();
            if (year %100==0 && year %400 ==0 ) {
                System.out.println("Это високосный год: 366 дней ");

            }else if (year % 4 == 0 && year % 100 > 0) {
                System.out.println("это високосный год: 366 дней ");

            }else if (year % 100 == 0) {
                System.out.println("это обычный год: 365 дней ");

            }else
                System.out.println("это обычный год: 365 дней ");


        }*/
        /**Scanner sc = new Scanner(System.in);
        System.out.println( " введите длину стороны a : ");
        int a = sc.nextInt();
        System.out.println( " введите длину стороны b :");
        int b = sc.nextInt();
        System.out.println( " введите длину стороны c : ");
        int c = sc.nextInt();
        if (a + b > c || b + c > a || c + a > b) {

            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует");
        }*/
        /**Scanner input2 = new Scanner(System.in);
        System.out.println(" введите число :  ");
        while (input2.hasNextDouble()) {
            double t = input2.nextDouble();

            t = t % 5;

            if (t >=0 && t <3                          ) {
                System.out.println(" зеленый ");
            } else if (t == 3) {
                System.out.println(" желтый ");
            } else if (t == 4) {
                System.out.println(" красный ");
            }*/






    }
}


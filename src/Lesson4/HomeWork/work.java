package Lesson4.HomeWork;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {

        /**1
         Ввести с клавиатуры два числа m и n.
         Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

         Пример: m=2, n=4
         8888
         8888
         * */


         /**   int m = 2;
            int n = 4;

        for (int i = 1; i <= m; i++ ) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }*/
        /**2
         Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

         Пример вывода на экран:
         8
         88
         888
         8888
         88888
         888888
         8888888
         88888888
         888888888
         8888888888
         * */

        String t = "";
        for (int i = 1; i <= 10; i++){
            System.out.println(t += "8");
        }


            /**3

             Ввести с клавиатуры три числа, вывести на экран среднее из них.
             Т.е. не самое большое и не самое маленькое.
             Если все числа равны, вывести любое из них.
             * */
           /** int a = 10;
            int b = 16;
            int c = 75;

            if ((a - b) * (c - a) >= 0) {
                System.out.print(a);
            } else if ((b - a) * (c - b) >= 0) {
                System.out.print(b);
            } else {
                System.out.print(c);
            }*/

/**4
 Вводить с клавиатуры числа.
 Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 -1 должно учитываться в сумме.

 Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

 while (true) {
 int number = считываем число;
 if (проверяем, что number -1)
 break;
 }
 * */

       /** Scanner scanner1 = new Scanner(System.in );
        System.out.println(" вводите числа пока не введете -1:");
        int a = scanner1.nextInt(), b = 0;
        while(a != -1) {
            b += a;
            a = scanner1.nextInt();
        }
        System.out.println(b-1);*/

        /**
         * 5
         * Вывести на экран таблицу умножения 10х10 используя цикл while.
         * Числа разделить пробелом.
         *
         * Пример вывода на экран:
         * 1 2 3 4 5 6 7 8 9 10
         * 2 4 6 8 10 12 14 16 18 20
         * 3 6 9 12 15 18 21 24 27 30
         * 4 8 12 16 20 24 28 32 36 40
         * 5 10 15 20 25 30 35 40 45 50
         * 6 12 18 24 30 36 42 48 54 60
         * 7 14 21 28 35 42 49 56 63 70
         * 8 16 24 32 40 48 56 64 72 80
         * 9 18 27 36 45 54 63 72 81 90
         * 10 20 30 40 50 60 70 80 90 100*/
        /** int g = 1;
         int v = 1;
         while (g != 11){
             while (v !=11){
                 System.out.print(g*v + " ");
                 v++;
             }
             System.out.println();
             g++;
             v=1;
         }*/
        /**6
         Ввести с клавиатуры строку name.
         Ввести с клавиатуры дату рождения (три числа): y, m, d.

         Вывести на экран текст:
         "Меня зовут name.
         Я родился d.m.y"

         Пример вывода:
         Меня зовут Вася.
         Я родился 15.2.1988
         * */

        /**Scanner scanner = new Scanner(System.in);
        System.out.println("имя:");
        String name = scanner.nextLine();
        System.out.println("год рождения:");
        int Y = Integer.parseInt(scanner.nextLine());
        System.out.println("месяц рождения:");
        int M = Integer.parseInt(scanner.nextLine());
        System.out.println("день:");
        int D = Integer.parseInt(scanner.nextLine());
        System.out.println("теперь мы все про тебя знаем!");


        System.out.println("Тебя зовут " + name);
        System.out.println("Ты родился " + D + "." + M + "." + Y);*/





    }
    }


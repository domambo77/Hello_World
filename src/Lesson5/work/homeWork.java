package Lesson5.work;

import java.util.Scanner;


public class homeWork {
    public static void main(String[] args) throws Exception
    {
/**1

 1. Создать массив на 10 строк.
 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

        /**Scanner str = new Scanner(System.in);

        int [] a = new int[10];
        System.out.println("введите содержание 8 строк");
        for (int i = 0; i < 8; i++) {
            a[i] = str.nextInt();
        }
        System.out.println("вывод строк в обратном порядке");
        for (int i = 7; i >= 0; i--) {
            System.out.println(a[i]);
        }

       /**2

        1.1. Создай массив на 10 чисел
        1.2. Считай с консоли 10 чисел и заполни ими массив
        2. Найти максимальное число из элементов массива
        * */

        /** Scanner str1 = new Scanner(System.in);

        int  []b = new int[10];

        System.out.println("введите содержание 10 строк");

       for (int i = 0; i < 10; i++) {
            b[i] = str1.nextInt();}

            int max = b[0];
            for (int i = 0; i < b.length; i++)
            {
                if (b[i] > max)
                    max = b[i];
            }

            System.out.println ("максимальное число из элементов массива " + max);


            /**3

             1. Создать массив на 10 строк.
             2. Создать массив на 10 чисел.
             3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
             4. В каждую ячейку массива чисел записать длину строки из массива строк,
             индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
             * */

       /** Scanner str2 = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("введите содержание 10 строк");

        for (int i = 0; i < 10; i++) {
            arr[i] = str2.nextInt();}

        String[] str = new String[10];

        System.out.println("Ввести с клавиатуры 10 строк, заполнить ими массив строк.");

         for (int i = 0; i < str.length; i++) {
         Scanner scanner = new Scanner(System.in);
         String s  = scanner.nextLine();
         str[i] =s;}
        for(int i = 0;i < arr.length;i++ )
        {
           arr[i] = str[i].length();
        }
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }


        /**4

         1. Создать массив на 10 чисел.
         2. Ввести с клавиатуры 10 чисел и записать их в массив.
         3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/


       /** Scanner arr2 = new Scanner(System.in);
        int []d = new int [10];
        System.out.println("Ввести с клавиатуры 10 чисел");
        for (int i = 0; i < 10; i++) {
            d[i] = arr2.nextInt();}
            for (int i = 9; i >= 0; i--) {
                System.out.println(d[i]);
            }
        }*/
       /** 5

        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/

      /**Scanner arr3 = new Scanner(System.in);
       int[] bigger = new int[20];
        System.out.println("Ввести 20 чисел ");

            int[]smaller1 = new int[10];
            int[]smaller2 = new int[10];
        int x = 0;
        int y = 0;
        for (int i = 0; i < bigger.length; i++) {
            bigger[i] = arr3.nextInt();
            if (i < 10){ smaller1[x] = bigger[i]; x++;  }
            else { smaller2[y] = bigger[i]; y++;}
        }
        for (int j = 0; j < smaller1.length; j++) {

            System.out.println(smaller2[j]);
        }

        /**6

         Создать массив на 20 чисел.
         Заполнить его числами с клавиатуры.
         Найти максимальное и минимальное числа в массиве.
         Вывести на экран максимальное и минимальное числа через пробел.
         * */

        Scanner arr4 = new Scanner(System.in);
        int[] mass = new int[5];
        int max = mass[0];
        int min = mass[0];
        System.out.println(" введите 20 чисел :");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = arr4.nextInt();
            if ( mass[i] > max){
                max = mass[i];
            }
            else if (mass[i] < max){
                min = mass[i];
            }
        }
        System.out.println("Минимальное: " + min + " . " + "Максимальное: " + max );

        /**7

         Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
         * */
       /** Scanner arr2 = new Scanner(System.in);
        int []d = new int [4];
        int maxToMin;
        System.out.println("Ввести с клавиатуры 20 чисел");
        for (int i = 0; i < d.length; i++) {
            d[i] = arr2.nextInt();}

        for (int i = 0; i < d.length-1; i++) {
            if (d[i] < d[i+1]){
                maxToMin = d[i];
                d[i] = d[i+1];
                d[i+1] = maxToMin;
                             }
        }System.out.println("числа по убыванию");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        for (int i = 0; i < d.length; i++) {*/

      /** int [] arr1 = new int [5];
       Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int count = arr1[i]; //временная переменная temp
                    arr1[i] = arr1[j];
                    arr1[j] = count; // меняется местами
                    }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        }








}








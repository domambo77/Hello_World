package lesson6;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {


        /**1

         Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

         Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
         Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
         Программа выводит слова на экран.
         * */
        /**Scanner scanner = new Scanner(System.in);
        String[] strings = new String[100];
        int count = 0;
        System.out.println("введите слова, нажмите enter  дважды как закончите:");
        while (true) {
            String str = scanner.nextLine();
            // str[i] = str;
            if (str.isEmpty()) {
                break;
            }
            strings[count] = str.toUpperCase();
            count++;
        }
        for (int i = 0; i < 3; i++) {
            if (strings[i].length() % 2 == 0) {
                System.out.println(strings[i] + " " + strings[i]);
            } else {
                System.out.println(strings[i] + " " + strings[i] + " " + strings[i]);
            }


            /**2

             Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
             * */

            /**Scanner input = new Scanner(System.in);
             System.out.println("Введите n строк, чтобы закончить ввод нажмите  enter дважды.");
             String str = input.nextLine();
             String minStr = str;
             String maxStr = str;
             while (!str.isEmpty()) {
             if (minStr.length() > str.length()) {
             minStr = str;
             } else if (maxStr.length() < str.length()) {
             maxStr = str;
             }
             str = input.nextLine();
             }
             if(minStr == maxStr) {
             System.out.println("Введена одна строка или строки одинаковы " + minStr);
             }
             else{
             System.out.println("Самая короткая строка " + minStr + " " + minStr.length() + " элемента(ов) ");
             System.out.println("Самая длинная строка строка " + maxStr + " " + maxStr.length() + " элементов ");
             }

             /**
             *3 1. Создать массив на 10 строк.
             * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
             * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки. */


            /** Scanner str = new Scanner(System.in);

             int [] a = new int[10];
             System.out.println("введите содержание 8 строк");
             for (int i = 0; i < 8; i++) {
             a[i] = str.nextInt();
             }
             System.out.println("вывод строк в обратном порядке");
             for (int i = 7; i >= 0; i--) {
             System.out.println(a[i]);
             }

             /**4

             1. Создать массив на 10 строк.
             2. Создать массив на 10 чисел.
             3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
             4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
             которой совпадает с текущим индексом из массива чисел.
             * */
            /**Scanner str2 = new Scanner(System.in);
             int [] arr = new int[10];
             System.out.println("введите содержание 10 строк");

             for (int i = 0; i < 10; i++) {
             arr[i] = str2.nextInt();}

             String[] str = new String[10];

             System.out.println("Ввести с клавиатуры 10 строк, заполнить ими массив строк.");

             for (int i = 0; i < str.length; i++) {
             Scanner scanner = new Scanner(System.in);
             String s  = scanner.nextLine();
             str[i] = s;
             }
             for(int i = 0;i < arr.length;i++ )
             {
             arr[i] = str[i].length();
             }
             for(int i = 0;i < arr.length;i++)
             {
             System.out.println(arr[i]);
             }*/

            /**5

             1. Считать 6 строк и заполнить ими массив strings.
             2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
             * */
            /** Scanner scanner = new Scanner(System.in);
             String[] strings = new String[6];
             for (int i = 0; i < strings.length; i++) {
             String str  = scanner.nextLine();
             strings[i] = str;
             }
             for (int i = 0; i < strings.length; i++) {
             for (int j = 0; j < strings.length; j++) {
             if (i != j && strings[i] != null) {
             if (strings[i].equals(strings[j])) {
             strings[i] = null;
             strings[j] = null;
             }
             }
             }
             } for (int i = 0; i < strings.length; i++) {
             System.out.println(strings[i]);
             }*/

        }
    }














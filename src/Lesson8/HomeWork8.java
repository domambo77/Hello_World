package Lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {


        /** 4
         Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
         Вывести на экран полученную сумму.*/

        System.out.println("Вводите целые числа, по окончании ввода наберите слово: сумма ");

        int sum = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
             String str = in.nextLine();
                  if (str.equals("сумма"))
         break;
            sum += Integer.parseInt(str);
            }
        System.out.println(sum);

        /** 5
         Написать программу, которая:
         1. считывает с консоли число N, которое должно быть больше 0
         2. потом считывает N чисел с консоли
         3. выводит на экран максимальное из введенных N чисел.*/

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int max;
        if (N > 0){
            max =  input.nextInt();
            for (int i = 1; i < N ; i++) {
                int numInput = input.nextInt();
                max = numInput > max ? numInput : max;
            }
            System.out.println(max);
    }
}
}

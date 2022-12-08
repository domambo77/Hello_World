package Lesson7;
import java.util.Scanner;

public class HomeWork7 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(checkFive(9));
        System.out.println(returnMinNum(9, 2));
        System.out.println(power(4, 6) + power(8, 3));

        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Ответ: " + result);

    }


        /**1 Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.*/
        public static int cube(int a) {
         return a * a * a;
         }

         /** 2 Напишите метод, который бы возвращал в консоль:

         true, если число больше 5
         и false, если число меньше 5*/
         public static boolean checkFive(int a){
         return (a > 5);
         }

         /**3 Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
         Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.*/
        public static int returnMinNum(int a, int b){
         if (a > b){
         return b;
         }
         else{
         return a;
         }
         }
         /**4 Необходимо написать метод, который бы возводил число в степень.
         И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.*/
        public static int power(int a, int b){
            int result = 1;
            for (int i=1; i<=b; i++){
                result = result * a;
            }
            return result;
        }

        /** 5 Условие задачи:
         Необходимо написать простой консольный калькулятор на Java.


         Метод int getInt() - должен считывать с консоли целое число и возвращать его
         Метод char getOperation() - должен считывать с консоли какое-то значение и
         возвращать символ с операцией (+, -, * или /)
         Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и
         num2 арифметическую операцию, заданную operation.
         Метод main() - должен считывать 2 числа (с помощью getInt()),
         считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.*/

        public static int getInt() {
            System.out.println("Введите целое число:");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println(" Ошибка при вводе числа. Повторите ввод.");
                scanner.next();
                num = getInt();
            }
            return num;
        }
        public static char getOperation () {
            System.out.println("Введите операцию используя знаки +,-,*,/:");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Нет такой операции. Повторите ввод.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }
        public static int calc ( int num1, int num2, char operation){
            int result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Нет такого значения. Повторите ввод.");
                    result = calc(num1, num2, getOperation());
            }
            return result;
        }
}
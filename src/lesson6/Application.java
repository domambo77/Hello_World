package lesson6;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        /**
         String и его основные методы

         1- String  является неизменяемым типом.

         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра


         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр

         2 - StringBuffer и StringBuilder
         * */
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        int length = data.length;
        System.out.println(length);

        String str1 = "Hello World";
        int lengthOfString = str1.length();
        System.out.println(str1.length());

        String str2 = null;
        String str3 = "World ";

        boolean b = str3.equals("World");

        String str4 = "Иванов";
        String str5 = "иванов";

        boolean c = str4.equalsIgnoreCase(str5);
        System.out.println(c);


        String str6 = "Hello ";
        String str7 = "World ";
        str6 += str7;
        System.out.println(str6);



        System.out.println(" Задача 1.принять от пользователя текст и перевернуть его" +

                " пример : Привет! Результат: !тевирП");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        for (int i = string.length()-1; i <=0 ; i--) {
            System.out.print(string.charAt(i));

        }

        System.out.println("задача2. поиск и замена символов в тексте");

        System.out.println(" /Hello *World!");
         String stringWithError = " /Hello *World!";
         stringWithError = stringWithError.replace("*" , " ");
        System.out.println(stringWithError);

        System.out.println(" задача 3. check email for char@");

        System.out.println(" text your mail-box");
        Scanner scanner1 = new Scanner(System.in);
        String eMail = scanner1.nextLine();

       // int index = eMail.indexOf("@");
        //System.out.println(index);

        if (eMail.indexOf("@") == -1) {
            System.out.println("error. you need to text mail-box with the character @");
            return;
        }

        String[] arr = eMail.split("@");
        int length1 = arr.length;
        if(arr.length != 2 ){
            System.out.println("eMail contains more than 1 character '@' ");
            return;
        }



        String partBeforDog = arr[0];
        String partAfterDog = arr[1];

        if(partBeforDog.startsWith(".") || partBeforDog.endsWith(".")){
            System.out.println("incorrect email/ email starts or end with the point");
            return;

        }
        if(partAfterDog.startsWith(".") || partAfterDog.endsWith(".")){
            System.out.println("incorrect email/ email starts or end with the point");
            return;
        }

        if (eMail.contains(" ")){
            eMail = eMail.trim();
        }

        if (eMail.contains("A")) {
            eMail = eMail.toLowerCase();
        }

        if (eMail.contains("a")) {
            eMail = eMail.toUpperCase();}

        System.out.println("everything is ok");
}
}

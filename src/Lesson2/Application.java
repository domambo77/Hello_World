package Lesson2;

public class Application {
    public static void main(String[] args) {
       // byte firstByte = 60;
        System.out.println("Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр треугольника");
        byte sideA = 60;
        byte sideB = 45;
        byte sideC = 17;

        int perimeter = sideA + sideB + sideC;
        System.out.println("Результат задачи: " + perimeter);
        System.out.println(" \n ");

        System.out.println("Задача:3. Дано: Коля получил мнго двоек и закопал свой дневник на 127 метров" +
                        "в глубину." +
                        "А потом вернулся и закопал его еще на 2 метра глубже." + " \n " +
                " На сколько метров Коля закопал свой дневник?");
        byte deep = 127;
        byte additionalDeep = 2;
        byte result = (byte) (deep + additionalDeep);
        System.out.println("Результат задачи" + result);

        System.out.println( " Задача 5. Дано: Есть 10, 3 и метод научного тыка." + " Найти длину после запятой float  и  double");
        int sample = 10;
        float dividibleFloat = 3;
        double dividibleDouble = 3;
        float resultFloat = sample / dividibleFloat;
        double resultDouble = sample / dividibleDouble;

        System.out.println( "Результат float " + resultFloat);
        System.out.println( " Результат double " + resultDouble);

        System.out.println("Задача 5. Дано: Есть 10, 3 и метод научного тыка. Найти длину после запятой float и double ");
        int redApple = 10;
        int greenApple = 5;
        boolean result2 = redApple > greenApple;
        System.out.println(result2);


        String w = "5";
        int q = Integer.parseInt(w);
    System.out.println(q);

        // домашка
        System.out.println("Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?");
        int sample1 = 5;
        float dividibleFloat1 = 2;
                float resultFloat1 = sample1 / dividibleFloat1;
        System.out.println( "Результат float " + resultFloat1);

        System.out.println("Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.");

        byte sideD = 50;
        byte sideE = 20;

        int space = sideD * sideE;
        System.out.println("Результат задачи: " + space);

        System.out.println("Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,\n" +
                " насколько быстрее голодный Вася съедает один банан?");
     byte minuteA = 9;
     byte minuteB = 15;
     byte bananaA = 3;
     byte bananaB = 3;
      int bananaM = (minuteB / bananaB) - (minuteA / bananaA);
        System.out.println( "ответ на " + bananaM + " минуты быстрее");

        System.out.println("Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение \"sum = 12\"");

               //        public class Application {
            //public static void main(String[] args) {
                int a = 3;
              //  int a = 10;
                int b = 6;
                //int b = 12;
                //int sum = 1 + a + b;
                //int sum = 2 + a + b;
                int sum = 3 + a + b;
                //int sum = 4 + a + b;

                System.out.println("sum = " + sum);
            //}
        System.out.println("Задача 5. В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.\n" +
                "Знаки нужно расставить только в строчке, в которой объявляется переменная result.\n" +
                "Порядок следования переменных в этой строке изменять нельзя.\n" +
                "Перед каждой переменной должен стоять знак либо плюс, либо минус.");
       // public class Application1 {
             int e = 1;
             int f = 3;
             int g = 9;
             int h = 27;

            //public static void main(String[] args) {

                int result3 = -e + f - g + h;

                System.out.println(result3);
            }
        }
       // }

      //  }
    //}


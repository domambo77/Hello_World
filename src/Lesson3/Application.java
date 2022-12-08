package Lesson3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        /**Арифметические операторы
         +  Складывает значения по обе стороны от оператора
         -  Вычитает правый операнд из левого операнда
         *  Умножает значения по обе стороны от оператора
         /  Оператор деления делит левый операнд на правый операнд
         %  Делит левый операнд на правый операнд и возвращает остаток
         ++  Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --  Декремент - уменьшает значение операнда на 1  х-- постфиксная, --х префиксная*/

        int s1 = 10;
        int s2 = 3;
        int rez = s1 % s2;
        System.out.println(rez);

        /**Операторы сравнения

         ==  Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным  (A == B) – не верны

         !=  Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным  (A != B) – значение истинна

         >  Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным  (A > B) – не верны

         <  Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным  (A < B) – значение истинна

         >=  Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным  (A >= B) – значение не верны

         <=  Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным  (A <= B) – значение истинна*/

        /**&&  Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||  Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !  Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false*/

        int w = 1;
        int x = w++;
        int y = ++w;
        System.out.println(x);
        System.out.println(w);
        System.out.println(y);


        int cash = 1500;
        int priceOfPizza = 230;
        int priceOfGum = 26;
        double priceOfCandy = 2.5;

        int countOfPizza = cash / priceOfPizza;

        System.out.println(countOfPizza);

        double balanceAfterPizza = cash % priceOfPizza;

        System.out.println(balanceAfterPizza);

        int countOfGum = (int) (balanceAfterPizza / priceOfGum);

        System.out.println(countOfGum);

        double balanceAfterGum = balanceAfterPizza % priceOfGum;

        System.out.println(balanceAfterGum);

        int countOfCandy = (int) (balanceAfterGum / priceOfCandy);

        System.out.println(countOfCandy);

        double change = balanceAfterGum % priceOfCandy;

        System.out.println(change);

        int sum1 = 10;
        int sum2 = 0;
        sum2 = sum1 + sum2;
        sum2 += sum1;
        sum2 -= sum1;
        sum2 *= sum1;
        System.out.println(sum2);

        char a = '@';
        char b = 64;
        boolean c = a == b;
        System.out.println(c);


        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = a1 || b1;//если один из вариантов  true,  то вернется true
        System.out.println(c1);
        boolean c2 = a1 && b1; //если один из вариантов  false,  то вернется false
        System.out.println(c2);

        boolean d1 = (!a1 && b1) || (a1 && b1);
        System.out.println(d1);
/**

 if (условие) {
 //действие(-я), которые выполняются, если условие истинно;
 }
 else if (условие) {
 //действие(-я), которые выполняются, если условие истинно;
 }
 else if (условие) {
 //действие(-я), которые выполняются, если условие истинно;
 }
 else {
 //действие(-я), которые выполняются, если условие истинно;
 }

 */
        int ageOfYourChild = 10;

        if (ageOfYourChild > 14) {
            System.out.println(" ура");
        } else if (ageOfYourChild < 14) {
            System.out.println(" совру");
        } else {
            System.out.println("домой");
        }


    /**
     * switch (ВыражениеДляВыбора) {
     * case  (Значение1):
     * Код1;
     * break;
     * case (Значение2):
     * Код2;
     * break;
     * ...
     * case (ЗначениеN):
     * КодN;
     * break;
     * default:
     * КодВыбораПоУмолчанию;
     * break;
     * }
     */
        int ball = 5;
        switch (ball) {
            case 5 -> System.out.println(" отлично ");
            case 4 -> System.out.println(" хорошо ");
            case 3 -> System.out.println(" удов ");
            case 2 -> System.out.println(" плохо ");
            default -> System.out.println(" нет такой ");
        }




    /** 1 Написать программу, чтобы она:
     - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
     - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
     - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.*/ {
        int number = 5;

        if (number < 5) {
            System.out.println(" число меньше 5 ");
        } else if (number > 5) {
            System.out.println(" число больше 5");
        } else {
            System.out.println("число равно 5");
        }
    }

    /** 2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
     в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
     "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.


     Пример для числа 112:
     Число 112 не содержится в интервале.

     Пример для числа 60:
     Число 60 содержится в интервале.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 50 до 100: ");
        while (input.hasNextInt()) {
            int number = input.nextInt();
            if (number < 50 || number > 100) {
                System.out.println("Число не в интервале {50-100}");
            } else if (number >= 50) {
                System.out.println("50-100");

            /** 3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.

             Пример для номера месяца 2:
             зима

             Пример для номера месяца 5:
             весна*/


                Scanner input1 = new Scanner(System.in);
                System.out.println("Введите число от 1 до 12: ");
                while (input1.hasNextInt()) {
                    int number1 = input.nextInt();
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
                    }
                }


            /**4
             Написать программу, которая будет проверять число, которое мы подадим ей.
             Если число положительное, то увеличить его в два раза.
             Если число отрицательное, то прибавить единицу.
             Если введенное число равно нулю, необходимо вывести ноль.
             Вывести результат в консоль.*/


                Scanner input4 = new Scanner(System.in);
                System.out.println("Введите число : ");
                while (input1.hasNextInt()) {
                    int number1 = input4.nextInt();
                    if (number1 > 1) {
                        System.out.println(number1 * 2);
                    } else if (number1 < 1) {
                        System.out.println(number1++);
                    } else if (number1 == 0) {
                        System.out.println(" 0 ");
                    }

                /** 5
                 Написать программу, которая, в зависимости от того числа, которое мы ей подадим выведет название дня недели.
                 "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
                 если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

                 Пример для номера 5:
                 пятница

                 Пример для номера 10:
                 такого дня недели не существует*/
               int number2;
                {
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Введите число от 1 до 7 :  ");
                    while (input2.hasNextInt()) {
                        number2 = input2.nextInt();
                        if (number2 == 1) {
                            System.out.println(" понедельник ");
                        } else if (number2 == 2) {
                            System.out.println(" вторник ");
                        } else if (number2 == 3) {
                            System.out.println("среда ");
                        } else if (number2 == 4) {
                            System.out.println(" четверг ");
                        } else if (number2 == 5) {
                            System.out.println(" пятница ");
                        } else if (number2 == 6) {
                            System.out.println(" суббота ");
                        } else if (number2 == 7) {
                            System.out.println(" восскресенье ");
                        } else {
                            System.out.println(" нет такого дня");
                        }
                /**6
                Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
                    , будет определять количество дней в году. Результат вывести на экран в следующем виде:
            количество дней в этом году: x
                    , где
                х - 366 для високосного года,
                    х - 365 для обычного года.

                    Подсказка:
                В високосном году - 366 дней, тогда как в обычном - 365.
                1) если год делится без остатка на 400 это високосный год;
                2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
                3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
                4) все оставшиеся года невисокосные.
                Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
                Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
                Годы 2100, 2200 и 2300 - не високосные.*/

                Scanner input3 = new Scanner(System.in);
                System.out.println("Введите год :  ");
                while (input2.hasNextInt()) {
                    int year = input3.nextInt();
                    if (year %100==0 && year %400 ==0 ) {
                        System.out.println("Это високосный год: 366 дней ");

                    }else if (year % 4 == 0 && year % 100 > 0) {
                        System.out.println("это високосный год: 366 дней ");

                    }else if (year % 100 == 0) {
                        System.out.println("это обычный год: 365 дней ");

                    }else
                        System.out.println("это обычный год: 365 дней ");


                }

               /**7
                Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
                Определить возможность существования треугольника по сторонам.
                Результат вывести на экран в следующем виде:
                "Треугольник существует." - если треугольник с такими сторонами существует.
                "Треугольник не существует." - если треугольник с такими сторонами не существует.

                Подсказка:
                Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
                Требуется сравнить каждую сторону с суммой двух других.
                Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.
                }*/

               Scanner sc = new Scanner(System.in);
                 System.out.println( " введите длину стороны a : ");
                 int d = sc.nextInt();
                 System.out.println( " введите длину стороны b :");
                 int e = sc.nextInt();
                 System.out.println( " введите длину стороны c : ");
                 int f = sc.nextInt();
                 if (d + e > f || e + f > d || f + d > e) {

                 System.out.println("Треугольник существует.");
                 }
                 else {
                 System.out.println("Треугольник не существует");
                 }

/**8
 Работа светофора для пешеходов запрограммирована следующим образом:
 в начале каждого часа в течение трех минут горит зелёный сигнал,
 затем в течение одной минуты - жёлтый,
 а потом в течение одной минуты - красный,
 затем опять зелёный горит три минуты и т. д.
 Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 Определить, сигнал какого цвета горит для пешеходов в этот момент.
 Результат вывести на экран в следующем виде:
 "зелёный" - если горит зелёный цвет,
 "жёлтый" - если горит жёлтый цвет,
 "красный" - если горит красный цвет.

 Пример для числа 2.5:
 зелёный

 Пример для числа 3:
 жёлтый

 Пример для числа 4:
 красный

 Пример для числа 5:
 зелёный */
                Scanner input6 = new Scanner(System.in);
                System.out.println(" введите число :  ");
                while (input2.hasNextDouble()) {
                    double t = input6.nextDouble();

                    t = t % 5;
                    if (t > 0 && t < 3 ) {
                        System.out.println(" зеленый ");
                    } else if (t == 3) {
                        System.out.println(" желтый ");
                    } else if (t == 4) {
                        System.out.println(" красный ");
                    }
                }

               /** double minutesFromTheBeginningOfTheHour = 2.5; //Время в минутах, прошедшее с начала очередного часа.
                boolean isCorrectTime = 0<=minutesFromTheBeginningOfTheHour && minutesFromTheBeginningOfTheHour <60; //Проверим значение на соответствие интервалу времени

                System.out.println("Время в минутах, прошедшее с начала очередного часа = " + minutesFromTheBeginningOfTheHour);

                if (isCorrectTime) {
                    if (minutesFromTheBeginningOfTheHour%5 == 0 || minutesFromTheBeginningOfTheHour%5 <3 ){
                        System.out.println("Светофор - зелёный");
                    } else if (minutesFromTheBeginningOfTheHour%5 >=4) {
                        System.out.println("Светофор - красный");
                    } else {
                        System.out.println("Светофор - жёлтый");
                    }
                } else {
                    System.out.println("Введите корректное значение времени");
                }

                System.out.println("\n--------------------------------------------------------------------\n");*/


        }
    }

}
}
        }
    }

}
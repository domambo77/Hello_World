package Lesson7;

public class Application7 {
    public static void main(String[] args) throws InterruptedException {
        //задача 1. написать таймер.
       /** for (int days = 0; days < 365; days ++){// Days
            for (int hours = 0; hours < 24; hours++){//Hours
                for(int min = 0; min < 60; min++){//Minutes
                    for (int sec = 0; sec < 60; sec++) {//Secundas
                        Thread.sleep(1000);// метод sleep
                        //%d - числовые типы, %s - строковые типы, \n - перенос каретки(абзац)
                        String name = "Денис ";
                        System.out.printf("%s,прошло дней %d, часов %d, минут %d, секунд %d",name, days, hours,min,sec);
                        //Форматированный вывод
                        System.out.println();
                        System.out.println("прошло дней" + days + " часов" + hours + "минут" + min + "секунд" + sec);
                    }
                }
            }
        }*/
       //Двумерные массивы
        // int [][] = new int[3][]; //объявление и инициализация двумерного массива

       /** int [][] numbers = {{5, 5, 8},
                               {6, 7, 8 },
                               {1, 0, 8}};

       /** System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.print(numbers[0][2]);
        System.out.println();

        System.out.print(numbers[1][0]);
        System.out.print(numbers[1][1]);
        System.out.print(numbers[1][2]);
        System.out.println();

        System.out.print(numbers[2][0]);
        System.out.print(numbers[2][1]);
        System.out.print(numbers[2][2]);
        System.out.println();*/

       /** for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }*/
        System.out.println("задача 2. наполнение двумерного массива цифрами от 10 и дальше +5");
        int [][] numbers2 = new int[5][5];
        int start = 10;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = start;
                start += 5;
            }
            System.out.println();
        }
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                 System.out.print(numbers2[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Задача 3. Распечатать двумерный массив по диагонали ");
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if (i ==j){
                    System.out.print(numbers2[i][j] + " ");
                }else {
                    System.out.print("  "); // двойной пробел
                }

            }
            System.out.println();//перенос строки

        }
        System.out.println("Задача 4. Распечатать  масссив в шахматном порядке");
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print(numbers2[i][j] + " ");
                }else {
                    System.out.print("  "); // двойной пробел
                }
            }
            System.out.println();//перенос строки

    }
}
}

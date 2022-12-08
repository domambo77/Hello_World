package Lesson11;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //1.Создание игры
        SaperGame saperGame = new SaperGame();

       /** int[][] field = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                int random = -rand.nextInt(2);
                System.out.print(random + "  ");
            }
            System.out.println();*/
             //2.Спросить у пользователя
             Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень сложности от 1-3:");
        System.out.println("1 - Высокий уровень сложности.");
        System.out.println("2 - Средний уровень сложности.");
        System.out.println("3 - Низкий уровень сложности.");
        int level = scanner.nextInt();

        //3. Настраивать сложность
        saperGame.bombsByLevel(level);

        //4.Расставить вспомогательные цифры.
        saperGame.placeHelpNumberOnMap();

        saperGame.printMapGame();

        while (true){
            int check = 0;
            System.out.println("Введите координаты по оси Х от 1 до 10");
            int pointX = scanner.nextInt();
            System.out.println("Введите координаты по оси Y от 1 до 10");
            int pointY = scanner.nextInt();
            if(pointX > 10 || pointX < 0 || pointY > 10 || pointY < 0){
                System.out.println("Некоректный ввод, выход за поле.");
                continue;

            }saperGame.printMapGame();
            check = saperGame.checkPointsPlayers(pointX,pointY); // 1,2,-1
            if (check == 2){
                System.out.println("Вы уже вводили эти координаты. Введите координаты еще раз");
            } else if (check == 1) {
                System.out.println("Следующий ход");
            } else if (check == -1) {
                System.out.println("Бомба! Вы проиграли!");

            }else {
                System.out.println("Поздравляю! Вы победили!");
            }
            saperGame.printMapGame();
        }


    }
}













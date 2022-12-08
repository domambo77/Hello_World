package Lesson12;

import Lesson12.Interfaces.BJGame;
import Lesson12.Interfaces.DeckOfCards;
import Lesson12.models.BJGameImlp;
import Lesson12.models.Croupier;
import Lesson12.models.DeckOfCardsImpl;
import Lesson12.models.PlayerImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Игра BlackJack
         * Цель заключается в том, чтобы набрать как можно больше очков, но не более 21 и обыграть нужно крупье.
         * В игре используется от одной до восьми колод. Из-за того что вероятность комбинации блек-джек при большем
         * числе колод ниже, то преимущество игрока уменьшается при увеличении числа колод. При игре с шаффл-машинкой
         * считается, что используется бесконечная колода.
         *
         * Значения очков каждой карты:
         *      от двойки до десятки — от 2 до 10 соответственно;
         *      у туза — 1 или 11 (11 пока общая сумма не больше 21, далее 1);
         *      у т. н. картинок (король, дама, валет) — 10;
         *
         * Если у игрока и дилера число очков на руках равное, то такая ситуация называется «ровно»: за рубежом это
         * называется — пуш (англ. push). В такой ситуации все остаются при своих ставках, никто не выигрывает и не
         * проигрывает. Хотя в казино бывают исключения, и при «push» выигрывает казино
         */
        //Interface Player                                 Class PlayerImpl
        //Player player = new PlayerImpl();
        //1. Создаем игру
        //2. Создавать игроков
        // 3. Создаем крупье
        // 4. Добавить игроков и добавить крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавить карты в колоду
        // 7. Раздать по 2 карты каждому игроку
        // 8. Раздавать каждому по 1 карте, пока это требуется
        // 9. Определить победителя

        //1. Создаем игру
        BJGame game = new BJGameImlp();

        //2. Создавать игроков
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player1, input your name");
        String player1Name = scanner.nextLine();
        System.out.println("Hello, " + player1Name + " !");


        System.out.println("Player2, input your name");
        String player2Name = scanner.nextLine();
        System.out.println("Hello, " + player2Name + " !");

        // 3. Создаем крупье
        Croupier croupier = new Croupier();

        // 4. Добавить игроков и добавить крупье в игру
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(croupier);

        // 5. Добавить колоду карт
        // 6. Добавить карты в колоду
        DeckOfCards deckOfCards = new DeckOfCardsImpl();

        // 7. Раздать по 2 карты каждому игроку
        game.giveToPlayersTwoCardsOnStart();

        // 8. Раздавать каждому по 1 карте, пока это требуется
        game.giveCardToPlayerIfNeed();

        // 9. Определить победителя
        game.determineWinner();






    }
}

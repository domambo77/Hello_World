package Lesson12.Interfaces;

import Lesson12.models.PlayerImpl;

public interface BJGame {
    //добавить игроков в игру
     void addPlayerToGame(PlayerImpl player);

    //Раздавать по две карты каждому игроку на старте
    void giveToPlayersTwoCardsOnStart();

    //Раздавать карты, пока это требуется
    void giveCardToPlayerIfNeed();

    //определить победителя
    void determineWinner();

    int countPlayersInGame();

}

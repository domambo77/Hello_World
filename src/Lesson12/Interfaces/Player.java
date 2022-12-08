package Lesson12.Interfaces;

import Lesson12.models.CardImpl;

public interface Player {
    void takeCard(CardImpl card);//взять карту из колоды

    int countValuesOfAllCardsOnHand();//посчитать количество очков в картах на руках

    boolean needCard(); //ответить нужна ли еще карта

    void showCardsOnHands();//показать карты
    
    boolean isInGame();
    
     void setInGame(boolean inGame);


      boolean isCroupier();
}

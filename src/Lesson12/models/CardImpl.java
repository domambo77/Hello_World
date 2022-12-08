package Lesson12.models;

import Lesson12.Interfaces.Card;

public class CardImpl implements Card {

    //Поля
    private int value;
    private String nameCard;

    //Конструкторы

    public CardImpl( String nameCard,int value) {
        this.value = value;
        this.nameCard = nameCard;
    }

    //Методы
    @Override
    public void printCard() {
        System.out.println(nameCard);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getNameCard() {
        return nameCard;
    }
}

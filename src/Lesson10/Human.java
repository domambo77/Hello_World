package Lesson10;

public class Human implements MySecondInterface{
    @Override
    public void go(){

    }
    @Override
    public void breathe(){

    }

    @Override
    public void drinkWater() {
        MySecondInterface.super.drinkWater();
    }
}

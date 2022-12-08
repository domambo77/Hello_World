package Lesson10;

public interface MyFirstInterface {
    void go();
    void breathe();

    default void drinkWater(){
        System.out.println("Я пью воду ");
    }
}

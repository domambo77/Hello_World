package Lesson16.SmartFridge;

public class Main {
    public static void main(String[] args) {
        SmartFridge fridge = new SmartFridge();
        fridge.putProducts("Apple", 5);
        fridge.putProducts("Eggs", 10);
        fridge.putProducts("Milk", 1);
        fridge.putProducts("Carrots", 10);
        fridge.putProducts("Coca-cola", 3);

        System.out.println();
        fridge.putProducts("Coca-cola", 1);
        fridge.putProducts("Pear", 1);
        fridge.putProducts("Milk", 1);
        fridge.putProducts("Eggs", 11);
        System.out.println();
    }
}

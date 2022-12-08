package Lesson9;

public class Veterinar {


   public void treatAnimal(Animal animal){
       System.out.println("Зовут " + animal.getName() +
               " Живет в " + animal.getLocation() + " ест " + animal.getFood());
    }
}

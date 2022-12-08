package Lesson15;

public class Dog {
    //поля
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    //Конструктор

    public Dog(String name) {
        this.name = name;
    }

    //Методы
    public void putCollar(){
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }
    public void putLeash(){
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }
    public void putMuzzle(){
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }
    public void walk() throws DogIsNotReadyToWalkException {
        System.out.println(name + " Идем гулять");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Ура идем гулять!");
        }else{
            throw new DogIsNotReadyToWalkException("Собака " + name + " не готова!");
        }
    }
}

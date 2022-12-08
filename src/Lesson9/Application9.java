package Lesson9;

import Lesson8.PhoneBook;

public class Application9 {
    public static void main(String[] args) {
        /**
         * ООП - объектно-ориентированное программирование. Основные принципы:
         1. Инкапсуляция - область видимости, реализована через модификаторы доступа:
         public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случаев использует
         protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других ＿
         --------- будет доступен только внутри текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);

         2. Наследование - extends - это механизм, который позволяет создавать классы на основе
         других классов наследуют их методы в дочерних (подчиненных) классах.

         3. Абстракция - означает выделение главных, наиболее значимых характеристик предмета и
         нооборот - отбрасывание второстепенных, незначительных.

         4. Полиморфизм - это способность программы идентично использовать объекты с одинаковым интерфейсом
         без информации о конкретном типе этого объекта.
         Мы можем работать со многими типами, как с одним (при условии, что эти типы являются производными (дочерними)
         от базового (разового) типа).
         * */
       /** PhoneBook phoneBook = new PhoneBook();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
        dog.say();
        cat.say();
        /**
         Для проверки можно ли наследоваться слово extends нужно заменить на "ЯВЛЯЕТСя ли",
         при однозначном ДА можно наследоват Если создать массив Человек[] люди = Человек[5];
         Тогда в нем можно хранить объекты подчиненных классов Ученик и Работник, а также ниже по иерархии,
         например ученик может делиться на первоклассников
         и старшеклассников.
         * */

       //Задача 1. Написать классы с музыкальными дисками и дисками с фильмами.
        DiskVideo diskVideo1 = new DiskVideo();
       diskVideo1.setName("Rambo.");
       diskVideo1.setDirector("Mark Polo.");
       diskVideo1.setGenre("Action.");
       diskVideo1.setTime(120);
       diskVideo1.setYear(1982);

        DiskVideo diskVideo2 = new DiskVideo();
        diskVideo2.setName("Terminator.");
        diskVideo2.setDirector("Spielberg.");
        diskVideo2.setGenre("Fantastic.");
        diskVideo2.setTime(90);
        diskVideo2.setYear(1984);

        DiskAudio diskAudio1 = new DiskAudio();
        diskAudio1.setName("Руки Вверх.");
        diskAudio1.setYear(1995);
        diskAudio1.setCountTrack(12);
        diskAudio1.setSinger("С. Жуков.");

        DiskAudio diskAudio2 = new DiskAudio();
        diskAudio2.setName("Ласковый май.");
        diskAudio2.setYear(1987);
        diskAudio2.setCountTrack(11);
        diskAudio2.setSinger("Ю. Шатунов.");

        diskAudio1.printInfo();
        diskAudio2.printInfo();
        diskVideo1.printInfo();
        diskVideo2.printInfo();

        Disk[] disks = new Disk[4];
        disks[0] = diskAudio1;
        disks[1] = diskAudio2;
        disks[2] = diskVideo1;
        disks[3] = diskVideo2;
        UtilDisk.findOldDisk(disks);



        Tovar tovar1 = new Tovar("Dress", "153", "8/10");
        Tovar tovar2 = new Tovar("Hat", "53", "7/10");
        Tovar tovar3 = new Tovar("Coat", "180", "9/10");
        Tovar tovar4 = new Tovar("Shirt", "110", "6/10");
        Tovar tovar5 = new Tovar("Pants", "153", "7/10");

     Tovar[] tovars = new Tovar[5];
     tovars[0] = tovar1;
     tovars[1] = tovar2;
     tovars[2] = tovar3;
     tovars[3] = tovar4;
     tovars[4] = tovar5;

        Category category = new Category("Clothes", 5);
        Category category1 = new Category("Shoes",6);
        Category category2 = new Category("Bags",9);



        Person Vitya = new Person("Vitya",25 );
        Person Dima = new Person( "Dima", 20 );
        User user = new User("jfhhdhf","jbhjhr");


        Dog dog = new Dog("Bone", "Bark", "Sleep");
        dog.setName("Bethoven");
        dog.setFood("Bone");
        dog.setLocation("CountryHouse");
        dog.setCanfindDrugs(true);

        Cat cat = new Cat("Farsh","meow", "murr");
        cat.setFood("Fish");
        cat.setName("Barsik");
        cat.setLocation("Home");
        cat.setCanCatchMouses(false);

        Horse horse = new Horse("Hay", "igogo", "hrrr");
        horse.setFood("Ovyos");
        horse.setName("Sugary");
        horse.setLocation("Field");
        horse.setJumping(true);
        horse.setSleepingAtStanding(true);
        horse.setColor("brown");

        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;

        Veterinar veterinar = new Veterinar();
     for (Animal a: animals) {
      veterinar.treatAnimal(a);



      Animals animals1 = new Animals();
      animals1.eat();

      Dogs dogs = new Dogs();
      dogs.eat();
      dogs.bark();

      Cats cats = new Cats();

      test(animals1);
      test(dogs);
      test(cats);




     }
    }
    public static void test(Animals animals1){
        animals1.eat();
    }
}

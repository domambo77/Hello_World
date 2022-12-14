package HomeWork8;

public class Solution  {

/** 3.      1. Внутри класса Solution создай public static классы Man и Woman.
            2. У классов должны быть поля: name (String), age (int), address (String).
            3. Создай конструкторы, в которые передаются все возможные параметры.
            4. Создай по два объекта каждого класса со всеми данными используя конструктор.
            5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

    В этой задаче можно создавать static class внутри основного класса.*/
    public static void main(String[] args) {
        Man man1 = new Man("Kolya", 22, "Moscow");
        Man man2 = new Man("Misha", 24, "Saratov");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman1 = new Woman("Masha", 26, "Samara");
        Woman woman2 = new Woman("Vika", 98, "Minsk");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}


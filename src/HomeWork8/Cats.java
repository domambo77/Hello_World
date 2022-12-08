package HomeWork8;

public class Cats {
/** 2
 Создать класс Cat (кот) с пятью конструкторами:
 - Имя,
 - Имя, вес, возраст
 - Имя, возраст (вес стандартный)
 - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
 - вес, цвет, адрес (чужой домашний кот)

 Задача конструктора - сделать объект валидным.
 Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить.
 То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.*/
    public static void main(String[] args) {

    }
    public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name)
    {
        this.name = "Киса";
         weight = weight;
        age = age;
        color = "Black";
        address = address;
    }
    public Cat(String name, int weight, int age)
    {
        this.name = "Маруся";
        this.weight = 6;
        this.age = 4;
        color = color;
        address = address;
    }
    public Cat(String name, int age)
    {
        this.name = "Барсик";
        this.age = 7;
        color = color;
        weight = weight;
        address = address;
    }
    public Cat(int weight, String color)
    {
        this.weight = 10;
        this.color = "Black";
        age = age;
        name = name;
        address = address;

    }
    public Cat(int weight, String color, String address)
    {
        this.weight = 5;
        this.color = "Gray";
        this.address = "neigborhood";
        age = age;
        name = name;
    }

    public static void main(String[] args) {

    }
}
}

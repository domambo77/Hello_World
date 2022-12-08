package Lesson8;

public class Application8 {
    public static void main(String[] args) {
        /**Методы-
         Название класса (файла) должно четко отвечать на вопрос какие в нем собраны методы.
         Методы лучше разбивать по смыслам на разные классы (файлы), не должны быть все методы собраны в одном классе;

         Формула создания метода-
         1- модификатор доступа - это одно из 4-х видов слов, указывается перед методом или классом:

         public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используется);

         protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других пакетах в данном проекте;
         --------------(package-private) будет доступен только внутри текущего пакета (текущей папки);

         private - только внутри текущего класса (файла);

         2-Статичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызываться у переменной text.split(" ");,
         то он не должен быть static; static - если метод будет вызываться у тuпа String.copyValue0f(char[] data);
         3-Возвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает,
         а просто выполняется, например, печать на консоль;

         4 - Название метода: поясняющее его суть, с моленькой буквы;

         5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа

         6 - тело метода (то что должно происходить, когда метод вызовут);

         public static void               printMassiveToConsole(int[][] mass)

         Модификаторы доступа метода      Сигнатура метода
         */

        //конструкторы и создание объектов классов

        String s = " ";
        String s1 = new String(" ");
        Contact denis = new Contact("Денис", "dhffjkf@mail.ru", "58777464675");
        Contact igor = new Contact("Игорь", "dhfbanyykf@mail.ru", "5847464675");
        Contact vasya = new Contact("Вася", "dhfbhasf@mail.ru", "58734464675");
        Contact viktor = new Contact("Виктор", "dhddfrjkf@mail.ru", "57877464675");
        Contact dima = new Contact("Дима", "dhfdgngnf@mail.ru", "58777124675");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(denis);
        phoneBook.addContact(igor);
        phoneBook.addContact(vasya);
        phoneBook.addContact(viktor);
        phoneBook.addContact(dima);
        phoneBook.search("Денис");
        phoneBook.edit("Виктор", "Виталий");
        phoneBook.delete("Виталий");




    }
}

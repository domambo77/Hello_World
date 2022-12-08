package Lesson13;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {


    /**
     * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
     * Изменяет размер динамически, но может включать в себя элементы только одного типа.
     * Примитивные типы нельзя хранить внутри коллекций.
     Для этого есть ссылочные типы примитивов:
     int Integer
     byte Byte
     short Short
     char Character
     * */

        //1. Создание коллекции и заполнение значениями
      //  ArrayList<Integer> list = new ArrayList<>();

        //int [] arr = new int[10];
        //arr [0] = 1;
        //arr [1] = 2;
        //arr [2] = 3;
        //arr [3] = 4;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        System.out.println("Элементы нашей коллекции: " + numbers);

       // for (int i = 0; i < numbers.size(); i++) {
         //   numbers.add(i);
        //}
        //System.out.println();

        //2. Добавление в коллекцию с указанием индекса
        numbers.add(4,55);
        System.out.println(numbers);

        //  try {
          // numbers.add(10,66);
        //}catch (Exception e){
          //  e.printStackTrace();
        //}
        //System.out.println("Программа продолжается");

        //3. Метод size() -возвращает размер коллекции

        System.out.println("Размер коллекции - " + numbers.size());


        // 4. Метод устанавливает объект на определенный индекс, удаляя предыдущий объект из коллекции

        numbers.set(2, 77);
        System.out.println(numbers);

        //5. Метод получения элементов коллекции по индексу - get();

        Integer b = numbers.get(0);
        System.out.println(b);

      //  for (int i = 0; i < numbers.size(); i++) {
        //    System.out.println(numbers.get(i));
        //}

        for (Integer c: numbers) {
            System.out.println(c);
        }

        //6.Возвращение коллкции в виде массива - toArray();

        Object[] array = numbers.toArray();
        for (Object o: array) {
            System.out.println(o);
        }

        //7. Метод contains(); проверка наличия этого элемента в колллекции

        String s = "Hello World !";
        boolean n = s.contains("Hello");

        System.out.println("Значении 11 в коллекции " + numbers.contains(11));
        System.out.println("Значении 99 в коллекции " + numbers.contains(99));

        //8. addAll - добавление всех элементов старой коллекциив новую

        ArrayList<Integer> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(numbers);

        //9.remove() - удаление элементов из коллекции по индексу

        numbers.remove(2);
        System.out.println(numbers);

        //10.indexOf - возвращает индекс элемента коллекции

        System.out.println("Элемент 11 находится на индексе " + numbers.indexOf(11));

        //11. isEmpty - возвращает булево значени, пустая коллекция или нет

        System.out.println("Коллекция numbers " + numbers.isEmpty());

        //12. clear(); - удаляет все элементы коллекции

        numbers.clear();
        System.out.println("Коллекция numbers " + numbers.isEmpty());







}
}

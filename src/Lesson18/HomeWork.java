package Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HomeWork {

    /**
            1
    Реализуй логику методов:
            1. readBytes - должен возвращать все байты файла fileName.
            2. readLines - должен возвращать все строки файла fileName. Используй кодировку по умолчанию.
            3. writeBytes - должен записывать массив bytes в файл fileName.
            4. copy - должен копировать файл resourceFileName на место destinationFileName.


    public static byte[] readBytes(String fileName) throws IOException {
        return null;
    }

    public static List<String> readLines(String fileName) throws IOException {
        return null;
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
    }*/
    public static byte[] readBytes(String fileName) throws IOException {
        return Files.readAllBytes(Paths.get (fileName));
    }

    public static List<String> readLines(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
        Files.write(Paths.get(fileName), bytes);
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
        Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName));}


        /** 2
    Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);*/
    /**      public static void main(String[] args) throws Exception {
        try
        {
            HashMap<String, String> map = new HashMap<String, String>(null);

            map.put(null, null);

            map.remove(null);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }



            /**  3
      Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
      Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово,
             а второй - число раз, сколько раз данное слово встречалось в списке.

      Выведи содержимое словаря на экран.
      В тестах регистр (большая/маленькая буква) влияет на результат.


      public static void main(String[] args) throws Exception {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          ArrayList<String> words = new ArrayList<String>();
          for (int i = 0; i < 20; i++) {
              words.add(reader.readLine());
          }

          Map<String, Integer> map = countWords(words);

          for (Map.Entry<String, Integer> pair : map.entrySet()) {
              System.out.println(pair.getKey() + " " + pair.getValue());
          }
      }

      public static Map<String, Integer> countWords(ArrayList<String> list) {
          HashMap<String, Integer> result = new HashMap<String, Integer>();

          //напишите тут ваш код


          return result;
      }*/
    /**public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String s : list) {
            result.put(s, Collections.frequency(list, s));
        }
        return result;
    }

          /**  4
    Есть класс кот - Cat, с полем "имя" (String).
    Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
    Получить из Map множество(Set) всех котов и вывести его на экран.


    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }*/ public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {

        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Киса0", new Cat("Киса 0"));
        map.put("Киса1", new Cat("Киса 1"));
        map.put("Киса2", new Cat("Киса 2"));
        map.put("Киса3", new Cat("Киса 3"));
        map.put("Киса4", new Cat("Киса 4"));
        map.put("Киса5", new Cat("Киса 5"));
        map.put("Киса6", new Cat("Киса 6"));
        map.put("Киса7", new Cat("Киса 7"));
        map.put("Киса8", new Cat("Киса 8"));
        map.put("Киса9", new Cat("Киса 9"));

        return (HashMap<String, Cat>) map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {

        Set<Cat> set = new HashSet<Cat>();
        Iterator <Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            set.add(iterator.next().getValue());
        }

        return (Set<Cat>) set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
    }




package Lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {





    /**
     1 Введи с клавиатуры 5 слов в список строк.
     Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*
     Scanner scanner = new Scanner(System.in);
     ArrayList<String> Strings = new ArrayList<>();
     System.out.println("Input 5 strings");

     for (int i = 0; i < 5; i++) {
     Strings.add(scanner.nextLine());
     }Strings.remove(2);
     for (int i = Strings.size()-1; i >=0 ; i--) {

     System.out.println(Strings.get(i));}

/**
     2
     1. Создай список из слов "мама", "мыла", "раму".
     2. После каждого слова вставь в список строку, содержащую слово "именно".
     3. Вывести результат на экран, каждый элемент списка с новой строки.*
     ArrayList<String> str = new ArrayList<>();
     str.add("Мама ");
     str.add("Мыла ");
     str.add("Раму ");
     String s = "именно";
     for (int i = 0; i < str.size(); i++) {
      str.add(i + 1, s);
      i++;
     }
     for (int i = 0; i < str.size(); i++) {
      System.out.println(str.get(i));}




    /** 3
     1. Создай список слов, заполни его самостоятельно.
     2. Метод fix должен:
     2.1. удалять из списка строк все слова, содержащие букву "р"
     2.2. удваивать все слова содержащие букву "л".
     2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
     2.4. с другими словами ничего не делать.


     public static void main(String[] args) {
     ArrayList<String> strings = new ArrayList<String>();
     strings.add("роза");
     strings.add("лоза");
     strings.add("лира");
     strings = fix(strings);

     for (String string : strings) {
     System.out.println(string);
     }
     }

     public static ArrayList<String> fix(ArrayList<String> strings) {
     //напишите тут ваш код
     return null;
     }*
    ArrayList<String> Stering = new ArrayList<>();
    Stering.add("раки");
    Stering.add("лиственница");
    Stering.add("попугай");
    Stering.add("мачете");
    Stering.add("лингвистический");
    Stering = fix(Stering);

     for (String s : Stering) {
      System.out.println(s);
     }



   /**  4
     1. Введи с клавиатуры 10 слов в список строк.
     2. Метод doubleValues должен удваивать слова по принципу:
     "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
     3. Выведи результат на экран, каждое значение с новой строки.*
   String s;
 ArrayList<String> list = new ArrayList<String>();
 Scanner scanner= new Scanner(System.in);
        for(int i = 0; i<10; i++){
  s=scanner.nextLine();
  list.add(s);
 }
 ArrayList<String> result = doubleValues(list);
        for(int i = 0;i<list.size();i++){
  System.out.println(list.get(i)); }

    /** 5
     1. Введи с клавиатуры 10 слов в список строк.
     2. Определить, является ли список упорядоченным по возрастанию длины строки.
     3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
     * */
     Scanner scanner2 = new Scanner(System.in);
    ArrayList<String> Str = new ArrayList<>();
     System.out.println("Input 10 words: ");
     for (int i = 0; i < 10; i++) {
    String s = scanner2.nextLine();
    Str.add (s); }
        for (int i = 0; i < Str.size ()-1; i++) {
         if (Str.get(i).length() > Str.get(i + 1).length()) {
          System.out.println(i + 1 + " элемент нарушает упорядоченность возрастания");
          break; }
        }
    }


 public static ArrayList<String> fix(ArrayList<String> Stering) {

  for (int i = 0; i < Stering.size(); i++)
  {
   if (Stering.get(i).contains("р") && Stering.get(i).contains("л")){
    continue;
   }else if (Stering.get(i).contains("р")){
    Stering.remove(i);
    i--;
   }else if (Stering.get(i).contains("л")){
    Stering.add(i, Stering.get(i));
    i++;
   }
  }
  return Stering;
 }

 public static ArrayList<String> doubleValues(ArrayList<String> list) {
  for(int i = 0 ; i<list.size(); i+=2){
   list.add(i,list.get(i));
  }
  return null;
 }
}





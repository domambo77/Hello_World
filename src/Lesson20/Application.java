package Lesson20;

import java.util.*;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Application {

    public static void map(List<Student> students, Function<Student, Integer> function){
        for (Student st: students) {
            System.out.println(function.apply(st));
        }
    }
    public static void main(String[] args) {



        Student student1 = new Student(1,"Ivan", "Petrov", "Lavrov", "05.05.1990",
                "05.05.2022", 7.5, 30, 1234);
        Student student2 = new Student(2,"Petr", "Petrov", "Lavrov", "05.05.1991",
                "05.05.2022", 7.8, 31,2351);
        Student student3 = new Student(3,"Igor", "Petrov", "Lavrov", "05.05.1992",
                "05.05.2022", 8.1, 32,2341);
        Student student4 = new Student(4,"Vasya", "Petrov", "Lavrov", "05.05.1993",
                "05.05.2022", 9.0, 33,2314);
        Student student5 = new Student(5,"Max", "Petrov", "Lavrov", "05.05.1994",
                "05.05.2022", 9.7, 34, 2312);

        List<Student>students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Predicate<Student> predicate = (Student std) -> std.getFirstName().startsWith("Vas"); //так
        Predicate<Student> predicate1 =  std -> std.getFirstName().startsWith("Vas");//или так
        Predicate<Student> predicate2 = (Student st) -> st.getAge() > 30;
        Predicate<Student> predicate3 =  st -> st.getMarkAv() > 8.9;

       // Consumer<Student> consumer = student -> System.out.println(student);
        Consumer<Student> consumer = System.out::println;

       // StatStudent.filterByAge(students,33);
        StatStudent.filterByAge(students, predicate2);
        System.out.println();
        StatStudent.filterByDateOfStartEd(students,"01.08.2022");
        System.out.println();
        //StatStudent.filterByMarkAv(students,9.0);
        StatStudent.filterByMarkAv(students,predicate3);
        System.out.println();
       // StatStudent.filterByName(students,"I");
       // StatStudent.filterByName(students, std-> std.getFirstName().startsWith("Vas"));
        StatStudent.filterByName(students, predicate);
        System.out.println();
        StatStudent.filterByName(students, predicate1);
        System.out.println();


        Supplier<String> supplier = () -> "Winter";
        System.out.println(supplier.get());

        //students.forEach(student -> System.out.println(student));
       // students.forEach(System.out::println);
        StatStudent.printStudent(students,consumer);

       // Consumer<String>print = x -> System.out.println(x);
        Consumer<String>print = System.out::println;
        print.accept("Winter");

        students.stream().filter(s ->s.getMarkAv()> 8.9).forEach(System.out::println);
        System.out.println();

        students.stream()
                .filter(s -> s.getPaidForEd() > 2300)
                .forEach(s -> {
                    s.setFirstName("Rich " + s.getFirstName());
                    System.out.println(s.getFirstName());
                });

        students.stream()
                .filter(student -> student.getAge()>30)
               // .map(s -> s.getMarkAv())
                .map(Student::getMarkAv)
                //.forEach(markAvg -> System.out.println(markAvg));
                .forEach(System.out::println);//проходит по каждому элементу
        Optional<Integer> reduce = students.stream()//суммирует элементы
                .filter(s -> s.getAge()>31)//фильтрует
                //.map(s -> s.getPaidForEd())
                .map(Student::getPaidForEd)//возвращает другой тип значений
               // .reduce((acc, i) -> acc+i);
                .reduce(Integer::sum);

        System.out.println(reduce.get());

       // if (reduce.isPresent()) System.out.println(reduce.get());
        reduce.ifPresent(System.out::println);
      //  reduce.orElseThrow(() -> new NoSuchElementException());
      //  reduce.orElseThrow(NoSuchElementException::new);
       // reduce.orElseThrow(NoSuchElementException::new).var
        Integer integer = reduce.orElseThrow(NoSuchElementException::new);
        //reduce.orElseGet(() -> 0);
       // reduce.orElseGet(() -> 0).var
        Integer integer1 = reduce.orElseGet(() -> 0);
        System.out.println(integer1);

        students.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .forEach(System.out::println);
        students.stream()
                .sorted(Comparator
                        .comparing(Student::getAge)
                        .thenComparing(Student::getFirstName)
                        .thenComparing(Student::getPaidForEd))
                .forEach(System.out::println);
        map(students, Student::getPaidForEd);

    }
}

class StatStudent{

//    public static void filterByAge(List<Student> students,int age){
//        for (Student student: students) {
//            if(student.getAge()<age) System.out.println(student);
//        }
//    }
public static void filterByAge(List<Student> students, Predicate<Student>predicate){
        for (Student student: students) {
            if(predicate.test(student)) System.out.println(student);
        }
    }

//    public static void filterByMarkAv(List<Student> students,double markAv){
//        for (Student student: students) {
//            if(student.getMarkAv()<markAv) System.out.println(student);
//        }
//    }
    public static void filterByMarkAv(List<Student> students,Predicate<Student>predicate){
        for (Student student: students) {
            if(predicate.test(student)) System.out.println(student);
        }
    }
   // public static void filterByName(List<Student> students,String name){  первая реализация
     //   for (Student student: students) {
       //     if(student.getFirstName().startsWith(name)) System.out.println(student);
        //}
    //}
  //  public static void filterByName(List<Student> students,StudentPredicate predicate){ вторая реализация
    //    for (Student student: students) {
      //      if(predicate.check(student)) System.out.println(student);
       // }
    //}
    public static void filterByName(List<Student> students, Predicate<Student> predicate){  //третья реализация
        for (Student student: students) {
            if(predicate.test(student)) System.out.println(student);
        }
    }

    public static void printStudent(List<Student> students, Consumer<Student> consumer){
        for (Student student: students) {
            consumer.accept(student);
        }
    }



   // public static void countMoney(List<Student> students, Function<Student, Integer> function){
    //    }


    public static void filterByDateOfStartEd(List<Student> students,String startEd){
        for (Student student: students) {
            if(student.getStartEd()) System.out.println(student);
        }
    }

    interface StudentPredicate{
        boolean check(Student student);
    }
 /**   static class StudentPredicateImpl implements StudentPredicate{

        @Override
        public boolean check(Student student) {
            return student.getFirstName().startsWith("Vas");
        }
    }*/
}


package Lesson22;



import Lesson20.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Ivan", "Petrov", "Lavrov", "05.05.1990",
                "05.05.2022", 7.5, 30, 1234);
        Student student2 = new Student(2, "Petr", "Petrov", "Lavrov", "05.05.1991",
                "05.05.2022", 7.8, 31, 2351);
        Student student3 = new Student(1, "Ivan", "Petrov", "Lavrov", "05.05.1990",
                "05.05.2022", 7.5, 30, 1234);
        Student student4 = new Student(4, "Vasya", "Petrov", "Lavrov", "05.05.1993",
                "05.05.2022", 9.0, 33, 2314);
        Student student5 = new Student(5, "Max", "Petrov", "Lavrov", "05.05.1994",
                "05.05.2022", 9.7, 34, 2312);

        student1.setStudy(true);
        student2.setStudy(true);
        student3.setStudy(false);
        student4.setStudy(false);
        student5.setStudy(false);


        student1.setCourse(1);
        student2.setCourse(1);
        student3.setCourse(2);
        student4.setCourse(2);
        student5.setCourse(2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Integer> list = List.of(1, 2, 3, 4);

        print(1, 2, 3, 4);

        Stream<Integer> integer1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integer2 = Stream.of(6, 7, 8, 9, 10);
        Stream.concat(integer1, integer2).forEach(System.out::println);

        students.stream()
                .distinct()
                .forEach(System.out::println);

        long count = students.stream()
                .count();
        System.out.println(count);

        students.stream()
                .distinct()
                .peek(System.out::println)
                .map(Student::getFirstName)
                .forEach(System.out::println);


        Object collect = students.stream()
                .distinct()
                .map(Student::getSecondName)
                .collect(ArrayList::new, List::add, List::addAll);

        List<String> collect1 = students.stream()
                .distinct()
                .map(Student::getSecondName)
                .collect(Collectors.toList());
        collect1.forEach(System.out::println);

        Map<Boolean, List<Student>> collect2 = students.stream()
                .collect(Collectors.partitioningBy(s -> s.isStudy()));
        System.out.println();

        Map<Integer, List<Student>> collect3 = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        System.out.println(collect2.get(1));
        System.out.println(collect2.get(2));

        students.stream()
                .filter(x ->x.getAge()==30)
                                .findFirst()
                .orElse(null);
        System.out.println(student1);

        students.stream()
                .filter(x ->x.getPaidForEd() == 1254)
                .findFirst()
                .orElse(null);
        System.out.println(student2);

        students.stream()
                .filter(x ->x.getAge() == 30)
                .skip(1)
                .forEach(System.out::println);
        System.out.println();

        students.stream()
                .filter(x ->x.getAge() == 30)
                .limit(2)
                .forEach(System.out::println);
        System.out.println();



    }

    public static void print(Integer... a) {
        System.out.println(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}






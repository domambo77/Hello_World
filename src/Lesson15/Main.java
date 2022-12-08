package Lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        for (Integer i: list) {
            System.out.print(i + " ");
        }
        System.out.println();

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.forEach(System.out::println);
    }
}

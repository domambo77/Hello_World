package Lesson14;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseInteger implements Comparator<Integer> {

    TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {

    @Override
    public int compare(Integer o1, Integer o2) { return o2 - o1;}
    });

    TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.hashCode() - o1.hashCode();
        }
    });

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }



}

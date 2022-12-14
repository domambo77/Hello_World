package FromYoutube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {


        List<String> person = new ArrayList<>();
        person.add("Maria");
        person.add("Zaur");
        person.add("Anton");
        System.out.println(person);
        Collections.sort(person);
        System.out.println(person);

    }
}

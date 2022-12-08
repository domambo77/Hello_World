package Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
            try
            {
                HashMap<String, String> map = new HashMap<String, String>(null);
                map.put(null, null);
                map.remove(null);
            }
            catch (Exception e)
            {
                System.out.println(e.toString()); }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            try {
                words.add(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        for (String s : list) {
            result.put(s, Collections.frequency(list, s));
        }
        return result;
    }
}


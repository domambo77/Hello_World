package Lesson16.Lesson16_StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationHashMap {
    public static void main(String[] args) {
      //  ArrayList<String> list = new ArrayList<>();
        //List<String> strings = new ArrayList<>();
        //Map<String, Integer> map1 = new HashMap<>();
        //1.Создание мапы
        HashMap<String, Integer> map = new HashMap<>();
        //2. Добавление элементов
        map.put("Dinamo", 5);
        map.put("Spartak", 4);
        map.put("CSKA", 6);
        map.put("SOVETII", 7);
        map.put("Dinamo", 8);

        //3. containsKey() - Вернет содержится ли какое-то значение по ключу

        System.out.println(map.containsKey("Dinamo"));
        System.out.println(map.containsKey("Zenit"));

        // 4. entrySet() - возвращает пару ключ-значение, getKey(), getValue()

        for ( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //5.Возвращение всех ключей
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        //6. Возвращение всех значений
        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.get("Dinamo"));


        System.out.println();
    }
}

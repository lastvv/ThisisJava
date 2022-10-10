package Main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class J5 {
    public static void main(String[] args) {
        //Объявил и инициализировал словарь hashMap<String, String>
        HashMap<String, String> cities = new HashMap<>();

        //Добавил в словарь 10 пар "Ключ - Значение"
        cities.put("Russia", "Moscow");
        cities.put("Korea", "Seoul");
        cities.put("Finland", "Rovaniemi");
        cities.put("Estonia", "Tallinn");
        cities.put("Sweden", "Stockholm");
        cities.put("China", "Beijing");
        cities.put("Spain", "Barcelona");
        cities.put("France", "Paris");
        cities.put("Italy", "Rome");
        cities.put("Turkey", "Antalya");
        System.out.println("initial hashmap is here: \n"+ cities);
        System.out.println("");

        //Прошёл по словарю и добавил к значениям символ "!"
        cities.replaceAll((k, v) -> v + "!");
        System.out.println("added '!' to all values: \n" + cities);
        System.out.println("");

        //Добавил нового автора и название книги если соответствующего ключа не было.
        cities.putIfAbsent("Tunisia", "Sousse");
        System.out.println("added new key: \n"+cities);
        System.out.println("");

        //Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово. 
        //Здесь не совсем понял, как делать, и просто изменил значение ключа
        if (cities.containsKey("Turkey")) {
            cities.replace("Turkey", "Istanbul");
        };
        System.out.println("changed a value for a key 'Turkey': \n"+cities);
        System.out.println("");

        //*Прошёл по словарю другим, не таким как в пункте 3, методом и вывел пары ключ значение в консоль.
        System.out.println("here are all keys and values: \n");
        for (Map.Entry entry: cities.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("");

        //Прошёл по словарю другим, не таким как в пункте 3 и 6, методом. Добавил к значениям строку "(просмотрен)" и вывел в консоль.
        Collection<String> values = cities.values();
        System.out.println("here are all checked values: \n");
        for (String str: cities.values()) {
            System.out.println(str + " просмотрено");
        }
    }
}

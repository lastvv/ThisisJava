package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class J3 {
    public static void main(String[] args) {

        // Создайте новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.
        ArrayList<String>rainbow = new ArrayList<>();
        rainbow.add("red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("purple");

        System.out.print("Создал список rainbow: \n");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ListIterator <String> liter = rainbow.listIterator();
        while (liter.hasNext()) {
            String i = liter.next();
            liter.set(i + "!");
        }
        System.out.print("Измененный rainbow с воскл. знаками: \n");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Вставить элемент в список в первой позиции.
        rainbow.add(1, "black");

        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("добавил новый цвет под индексом 1: " + rainbow.get(1));
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Обновить определенный элемент списка по заданному индексу.
        System.out.println("обновил элемент с индексом 0: ");
        rainbow.set(0, "mint");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Удалить третий элемент из списка.
        rainbow.remove(2);
        System.out.println("удалил третий элемент: ");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        
        // Напишите программу для поиска элемента в списке массивов 
        System.out.println("распечатал все элементы, содержащие 'bl': ");
        for (String color : rainbow) {
            if(color.contains("bl")){
                System.out.println(color);
            }
        }
        
        // Ссортировки заданного списка массивов.
        Collections.sort(rainbow);
        System.out.println("а вот отсортированный по алфавиту список: ");
        for (int i = 0; i < rainbow.size(); i++) {
            System.out.println(rainbow.get(i));
        }
        }
    }
}

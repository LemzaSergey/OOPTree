package com.company;

import java.util.Comparator;
import java.util.Map;

import lib.TreeBidiMap.TreeBidiMap;
import lib.TreeMap.TreeMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {


        TreeMap<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        map.put(new Person("Иван", "Петрович", 17), 0);
        map.put(new Person("Владимир", "Петренко", 65), 1);
        map.put(new Person("Анна", "Ушакова", 32), 5);
        map.put(new Person("Ирина", "Филипова", 14), 3);
        map.put(new Person("Сергей", "Лемза", 19), 4);
        map.put(new Person("Иван", "Лемза", 19), 6);

        for (Map.Entry<Person, Integer> pair : map.entrySet()) {
            System.out.println("Имя - "+pair.getKey().firstName+" Фамилия - "+pair.getKey().lastName+" Возраст - "+pair.getKey().age+ " " + pair.getValue());
        }


    }


}

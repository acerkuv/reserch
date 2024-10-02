package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Unit u = new Unit();
        Set<Object> set = new HashSet<Object>();
        u.setX(1); u.setY(1);

        // Задача сравнить два обьекта оного класса с обдинаковыми параметрами
        // Они должны быть равны, а обьексты оного класса с разными параметрами не должны быть равны
        System.out.println(u.equals(new Unit(1, 1)));

        System.out.println(u.equals(new Unit(1, 2)));

    }
}
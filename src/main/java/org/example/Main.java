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

        System.out.println(new Unit(7, 7).equals(new Unit(7, 7)));

        System.out.println(set.add(new Unit(0,1)));
        System.out.println(set.add(new Unit(0,0)));
        System.out.println(set.add(new Unit(0,1)));

        // Коллизия нулевых координат
        u.setX(0); u.setY(0);
        Unit u2 = new Unit(99, 99);
        boolean collision = u.hashCode() == u2.hashCode();
        System.out.println("Коллизия нулевых координат HashCode() u b u2 равны? " + collision);
    }
}
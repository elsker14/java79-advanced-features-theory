package com.javaremotero79.part3_dsa_collections.set.car;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        Set<CarComparable> carComparableSet = new TreeSet<>();

        carComparableSet.add(new CarComparable("Gri", "Peugeot", 5));
        carComparableSet.add(new CarComparable("Rosu", "Seat", 5));
        carComparableSet.add(new CarComparable("Rosu", "Bmw", 5));
        carComparableSet.add(new CarComparable("Negru", "Masserati", 3));
        carComparableSet.add(new CarComparable("Roz", "Masserati", 3));
        carComparableSet.add(new CarComparable("Roz", "Masserati", 3)); // => duplicitar ptc toate atributele din comparator sunt egale

        for (CarComparable it : carComparableSet) {
            System.out.println(it.getMarca() + " " + it.getNrLocuri() + " " + it.getCuloare());
        }

    }
}
package com.javaremotero79.part4_generic.functional_interface.built_in;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HybridMain {

    public static void main(String[] args) {
        // Solutie pt to do: incorporati algoritmul de verificare si
        // afisare a numerelor pozitive dintr-o lista intr-un Consumer

        Consumer<List<Integer>> printPositiveNumbers = list -> {
            Predicate<Integer> isPositive = nr -> nr > 0;
            for (Integer element: list) {
                if(isPositive.test(element)) {
                    System.out.print(element + " ");
                }
            }
        };

        printPositiveNumbers.accept(List.of(-1,2,3,1,3,-2,-121,33,2,1,2,-2));
    }
}

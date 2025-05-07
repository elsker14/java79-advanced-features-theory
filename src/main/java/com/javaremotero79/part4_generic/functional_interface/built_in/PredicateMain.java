package com.javaremotero79.part4_generic.functional_interface.built_in;

/*
    Predicate = e o I.F. care intoarce un rezultat boolean si primeste un argument generic
    - este singura I.F. care intoarce boolean, automat scopul principal este
    stocarea si rezolvarea metodelor conditionale
 */

import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        // todo: incorporati algoritmul de verificare si afisare a numerelor pozitive dintr-o lista intr-un Consumer
        List<Integer> numbers = List.of(-1,2,3,1,3,-2,-121,33,2,1,2,-2);
        Predicate<Integer> isPositive = nr -> nr > 0;
        for(Integer it: numbers) {
            if(isPositive.test(it)) {
                System.out.print(it + " ");
            }
        }
        System.out.println("\n-----------------");

        Predicate<Integer> isPrime = number -> {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && i != number) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(2));
        System.out.println(isPrime.test(22));
        System.out.println(isPrime.test(13));
        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(8));
    }

    private static boolean checkPrimeNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i != number) {
                return false;
            }
        }
        return true;
    }
}

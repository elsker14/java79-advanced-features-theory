package com.javaremotero79.part4_generic.functional_interface.built_in;

/*
    Function = e o I.F. care primeste un argument si produce un rezultat
 */

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        // input: String word = "              hello                               ";
        // output: String "HELLO"
        Function<String, String> trimAndUpper = it -> {
            String trimmedWord = it.trim();         // "hello"
            return trimmedWord.toUpperCase();       // "HELLO"
        };
        System.out.println(trimAndUpper.apply("              hello             "));
        System.out.println("-----------------");

        Function<Integer, Double> sumaArmonica = number -> {
            double sum = 0.0;
            for (int i = 1; i <= number; i++) {
                sum += 1.0/i;
            }
            return sum;
        };
        System.out.println(sumaArmonica.apply(3));
        System.out.println(FunctionMain.getCalculedSumaArmonica(3));
    }

    // EXEMPLU PT CONVERTIREA LA FUNCTION
    private static double getCalculedSumaArmonica(int number) {
        double sum = 0.0;   // result
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}

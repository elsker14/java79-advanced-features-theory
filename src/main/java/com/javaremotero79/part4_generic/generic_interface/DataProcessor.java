package com.javaremotero79.part4_generic.generic_interface;

/*
    - NU PUTEM FOLOSI INSTRUCTIUNI LAMBDA ptc avem mai mult de o metoda abstracta
    - ofera suport pt abstractii mult mai complexe
    - putem aveam mai multe metode abstracte
 */

public interface DataProcessor<T> {

    void process(T item);
    boolean validate(T item);
    String serialize(T item);
}

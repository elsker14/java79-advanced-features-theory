package com.javaremotero79.part4_generic.generic_class;

/*
    Pt Generalizare
        Pro:
            - avem aceeasi structura de constructor
                -- acelasi nr de elemente
            - putem generaliza tipurile de date ale atributelor
            in semnatura clasei
            - daca clasele supuse generalizaarii fac parte din acelasi
            context functional

        Contra:
            - daca exista cel putin un atribut sau o metoda specifica
            clasei de obiect
            - daca contextul claselor este FUNDAMENTAL diferit
 */

import java.util.function.Function;

public class Box<T> {

    private T value;
    private String label;
    private static int count;

    public Box(T value, String label) {
        this.value = value;
        this.label = label;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                ", label='" + label + '\'' +
                '}';
    }
}

package com.javaremotero79.part4_generic.functional_interface.custom;

/*
    Functional Interfaces:
    - este o simpla interfata Java cu EXACT o metoda abstracta
    - putem avea mai multe metode default sau statice, insa mereu una singura abstracta
    - atat metodele default, cat si cele statice trebuie sa aiba un corp de implementare
    - metoda abstracta pe care o definim devine target al tipului de expresie lambda (neparametriaza sau parametrizata)
    - interfetele functionale sunt marcate de @FunctionalInterface

    Interefetele functionale pot functiona cu sau fara implementari generice.

    Asociere prieteneasca: (INPUT) -> {OUTPUT}
        - INPUT: reprezinta argumentele metodei
        - OUTPUT: reprezinta rezultatul in urma metodei
            -- void
            -- returnabil
    Expresie lambda generica: (<iteratori>) -> {business logic care sa produca rezultatul metodei}
    - nu e nevoie sa utilizam keywordul return IN CAZUL IN CARE implementarea este un one-liner
    insa, daca implementarea e mai complexa va fi nevoie de acolade {} si de return
    - totodata, rezultatul MEREU trebuie sa fie de tipul de date al metodei

    Putem discuta despre 2 categorii de interfete functionale raportate la nr de argumente ale metodelor
    abstracte:
        - metode neparametrizate:
        - metode parametrizate
 */

@FunctionalInterface
public interface Message {

    String display();

    static String display2() {
        return "Hello!";
    }
}

package com.javaremotero79.part2_oop_principles.polymorphism;

public class FrontEndDev extends Developer {

    // polimorfism dinamic - suprascriere in baza mostenirii
    @Override
    public void work() {
        System.out.println("FrontEndDev works");
    }
}

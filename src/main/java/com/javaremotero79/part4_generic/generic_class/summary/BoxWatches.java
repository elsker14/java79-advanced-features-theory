package com.javaremotero79.part4_generic.generic_class.summary;

public class BoxWatches {

    private Watch object;
    private String brand;
    private static int countWatches;

    public BoxWatches(Watch object, String brand) {
        this.object = object;
        this.brand = brand;
    }

    public Watch getValue() {
        return object;
    }

    public void setValue(Watch value) {
        this.object = value;
    }

    public void tick() {
        System.out.println("Tick tick tac");
    }
}

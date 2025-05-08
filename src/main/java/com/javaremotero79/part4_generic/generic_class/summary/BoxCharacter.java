package com.javaremotero79.part4_generic.generic_class.summary;

public class BoxCharacter {

    private Character letter;
    private String text;
    private static int countLetters;

    public BoxCharacter(Character letter, String text) {
        this.letter = letter;
        this.text = text;
    }

    public Character getValue() {
        return letter;
    }

    public void setValue(Character value) {
        this.letter = value;
    }

}

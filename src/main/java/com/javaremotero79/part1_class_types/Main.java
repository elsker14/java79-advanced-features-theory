package com.javaremotero79.part1_class_types;

import com.javaremotero79.part1_class_types.class_abstract.AbstractAnimal;
import com.javaremotero79.part1_class_types.class_abstract.Bird;
import com.javaremotero79.part1_class_types.class_abstract.Dog;
import com.javaremotero79.part1_class_types.class_interface.Crocodile;
import com.javaremotero79.part1_class_types.class_interface.InterfaceAnimal;
import com.javaremotero79.part1_class_types.class_interface.Parrot;
import com.javaremotero79.part1_class_types.class_object_concrete.ConcreteAnimal;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /* Clasa de obiect / Clasa concreta */
        ConcreteAnimal concreteAnimalObject1 = new ConcreteAnimal();
        concreteAnimalObject1.setRasa("pisica");
        concreteAnimalObject1.setVarsta(3);
        ConcreteAnimal concreteAnimalObject2 = new ConcreteAnimal("caine", 2);

        System.out.println("Afisari ale unei clase de obiect (concrete): ");
        System.out.println(concreteAnimalObject1);
        System.out.println(concreteAnimalObject2 + "\n");

        /* Abstract Class */
        // AbstractAnimal abstractAnimalObject = new AbstractAnimal(); -> 'AbstractAnimal' is abstract; cannot be instantiated
        System.out.println("Afisari ale unei clase abstracte (parent class) " +
                "si a claselor mostenite (sub-classes):");
        Dog dogObject = new Dog();
        dogObject.eat();
        dogObject.makeSound();
        Bird birdObject = new Bird();
        birdObject.eat();
        birdObject.makeSound();
        System.out.println();

        /* Interface  */
        System.out.println("Afisari din interfata si clase de implementare: ");
        InterfaceAnimal animalObject1 = new Crocodile();
        // e relevant in cazul in care avem o relatie unica de implementare
        // o unica interfata e implementata de o clasa de implementare
        // o clasa de implementare implementeaza O SINGURA interfata unica
        Crocodile crocodileObject = new Crocodile();
        animalObject1.doSound();
        crocodileObject.doSound();

        InterfaceAnimal animalObject2 = new Parrot();
        Parrot parrotObject = new Parrot();
        animalObject2.doSound();
        parrotObject.doSound();
        System.out.println();

        /** Clase Anonime */
        // Putem instatia obiecte de tipul unei clase abstracte?
        // Nu. E nevoie de o clasa copil care sa mosteneasca/extinda clasa abstracta care se va comporta ca
        // o clasa parinte.
        // ------------------------------------
        // Da, putem prin definirea si instantierea unui obiect folosind clasele anonime, astfel incat sa oferim
        // un corp de implementare in interiorul clasei de apel. Totusi, daca scopul nostru e doar instantierea obiectului,
        // atunci nu este posibil, e nevoie de o relatie de mostenire intre clasa abstracta si o clasa copil (subclasa).
        /* Clasa abstracta */
        AbstractAnimal abstractAnimalObject = new AbstractAnimal() {
            @Override
            public void makeSound() {

            }
        };

        /* Interfata */
        // Putem instatia obiecte de tipul unei interfete?
        // Da, putem insa, suntem nevoiti sa cream implementarea in interiorul clasei de apel prin definirea
        // unei clase anonime de moment folosind o expresie lamba neparametrizata.
        // Insa, dpdv sintatic, nu putem instantia obiecte de tipul unei interfete ptc intr-o interfata nu
        // putem crea constructori.
        InterfaceAnimal interfaceAnimalObject;
    }
}

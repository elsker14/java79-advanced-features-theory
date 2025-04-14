package com.javaremotero79.part1_class_types.class_inner;

import com.javaremotero79.part1_class_types.class_abstract.AbstractAnimal;
import com.javaremotero79.part1_class_types.class_abstract.Dog;
import com.javaremotero79.part1_class_types.class_interface.InterfaceAnimal;

public class InnerClass {

    /* Static Nested Class */
    static class StaticNestedClassExample {
        // putem avea atribute, constructori, alte metode, getters/setters, orice metoda de suprascriere

        void display() {
            System.out.println("Salutare din interiorul unei clase statice interna!");
        }
    }

    /* Non-static Nested Class */
    class NonStaticNestedClassExample {
        // putem avea atribute, constructori, alte metode, getters/setters, orice metoda de suprascriere

        void display() {
            System.out.println("Salutare din interiorul unei clase non-statice interna!");
        }
    }

    /* Beneficii si scenarii comune:
     * imbunatatirea modularizarii si a structurii
     * scopul este de a izola o logica interna utilizata exclusiv in clasa de definitie
     *
     * Diferenta principala intre cele 2 este modul de apelare.
     *   - Static Nested class se va apela la nivel de clasa -> InnerClass.StaticNestedClassExample ...
     *   - Non-Static Nested class se va apela clasa la nivel de instanta de obiect a clasei de apelare
     *       -> InnerClass obj = new InnerClass(), obj.NonStaticNestedClassExample ...
     * */


    public static void main(String[] args) {
        /* Clasa statica interna */
        InnerClass.StaticNestedClassExample staticNestedClassObject = new StaticNestedClassExample();
        staticNestedClassObject.display();

        /* Clasa non-statica interna */
        InnerClass innerClassObject = new InnerClass();
        NonStaticNestedClassExample nonStaticNestedClassObject = innerClassObject.new NonStaticNestedClassExample();
        nonStaticNestedClassObject.display();

        /* Clase Anonime */
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
                System.out.println("Sunet din interiorul unei clase anonime!");
            }
        };
        abstractAnimalObject.eat();
        abstractAnimalObject.makeSound();

        /* Interfata */
        // Putem instatia obiecte de tipul unei interfete?
        // Da, putem insa, suntem nevoiti sa cream implementarea in interiorul clasei de apel prin definirea
        // unei clase anonime de moment folosind o expresie lamba neparametrizata.
        // Insa, dpdv sintatic, nu putem instantia obiecte de tipul unei interfete ptc intr-o interfata nu
        // putem crea constructori.
        InterfaceAnimal interfaceAnimalObject = new InterfaceAnimal() {
            @Override
            public void doSound() {

            }

            @Override
            public void doSomething() {
                System.out.println("Hello dintr-o implementare anonima a unei interfete!");
            }

            @Override
            public int calculateNumber() {
                return 0;
            }

            @Override
            public String generateText() {
                return "";
            }

            @Override
            public Dog getDog() {
                return null;
            }
        };
        interfaceAnimalObject.doSomething();
    }
}

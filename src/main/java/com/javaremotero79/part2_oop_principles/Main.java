package com.javaremotero79.part2_oop_principles;

import com.javaremotero79.part2_oop_principles.encapsulation.UserAccount;

public class Main {

    public static void main(String[] args) {
        /* Encapsulation */
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("jianu14");
        userAccount.setPassword("catelusCuParulCret14*");

        System.out.println(userAccount.getUsername() + "\n");

        /* Inheritance */
        Employee employee = new Employee("1234", "Iancu", "Jianu", 27);
        Chef chef = new Chef("9876", "Ion", "Ionel", 23, "Ajutor de bucatar");
        Waiter waiter = new Waiter("5678", "Maria", "Mariuca", 29, 56.2);

        System.out.println("Input din parent class Employee: " + employee.generateText());
        employee.sayHi();

        System.out.println("Input din parent class Chef: " + chef.generateText());
        chef.sayHi();

        System.out.println("Input din parent class Waiter: " + waiter.generateText());
        waiter.sayHi();
    }
}

package Seminar5;

import Seminar5.Task1.PhoneBook;

public class Seminar5Run {
    public static void main(String[] args) {
        // task1
        System.out.println("Задача №1");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber("Иван", 12341);
        phoneBook.addNumber("Иван", 2);
        phoneBook.addNumber("Петя", 31);
        phoneBook.printBook();

        // task2
        System.out.println("\n\nЗадача №2");
    }
}

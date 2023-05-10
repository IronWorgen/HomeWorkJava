package Seminar5;

import Seminar5.Task1.PhoneBook;
import Seminar5.Task2.Task2;
import Seminar5.Task3.Chess;
import Utility.JustFunction;

public class Seminar5Run {
    public static void main(String[] args) {
        //  task1
        System.out.println("Задача №1");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber("Иван", 12341);
        phoneBook.addNumber("Иван", 2);
        phoneBook.addNumber("Петя", 31);
        phoneBook.printBook();

        //  task2
        System.out.println("\n\nЗадача №2");
        Task2 task2 = new Task2("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, " +
                "Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов");
        task2.sortedPrint();

        //  task3
        System.out.println("\n\nЗадача №3");
        Chess chess = new Chess();
        System.out.println();

        JustFunction.printSquareArray(chess.run(0,0));


    }
}

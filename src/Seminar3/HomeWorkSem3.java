package Seminar3;


import Utility.JustFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWorkSem3 {

    /*
    1.  Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
     */
    public ArrayList<String> createList(int len) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            System.out.printf("Введите %d элемент: ", i + 1);
            list.add(scanner.nextLine());
        }
        return (ArrayList<String>) list;
    }

    public ArrayList<String> removeIntegerInList(ArrayList<String> list) {
        String item;
        int i = 0;
        while (i < list.size()) {
            item = list.get(i);
            try {
                Integer.parseInt(item);
                list.remove(i);
            } catch (NumberFormatException e) {
                i++;
            }
        }
        return list;
    }

    /*
            2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
            что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
            Напишите метод для заполнения данной структуры(можно через консоль).
     */

    public void createLibrary() {
        Task2Library library = new Task2Library();
        library.addBook("Классика", "Преступление и наказание");
        library.addGenre("Научная фантастика");
        library.addBook("Научная фантастика", "Ночной дозор");
        library.addBook("Научная фантастика", "Братья Стругацкие");
        library.showLib();
        library.addBook("Научная фантастика", "Ночной дозор");

        System.out.println(library.getGenre("Братья Стругацкие"));

        String[] books = library.getBooksByGenre("Научная фантастика");
        System.out.print("Научная фантастика: ");
        JustFunction.printArray(books);


    }

}

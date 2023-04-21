package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;

/*
    2.  Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
        Напишите метод для заполнения данной структуры(можно через консоль).
        Пример:
            "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
            "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
            "Детектив", "Десять негритят".
            "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
 */

public class Task2Library {
    private ArrayList<ArrayList<String>> lib = new ArrayList<>();

    // Добавить новый жанр в библиотеку
    public void addGenre(String genre) {
        //проверка на существование жанра в коллекции
        if (genreIsFound(genre)) {
            System.out.println("Такой жанр уже существует\n");
            return;
        }
        // добавление нового жанра
        lib.add(new ArrayList<String>(Arrays.asList(genre.trim())));
    }

    // Добавить книгу book в жанр genre
    public void addBook(String genre, String book) {
        for (int i = 0; i < lib.size(); i++) {
            ArrayList<String> bookShelf = lib.get(i);
            if ((bookShelf.get(0).trim()).equals(genre.trim())) {
                // добавить проверку наличия книги
                for (int j = 1; j < bookShelf.size(); j++) {
                    if (bookShelf.get(j).equals(book.trim())) {
                        System.out.printf("Книга \"%s\" уже существует\n", book);
                        return;
                    }
                }
                // добавляем книгу, если ее еще нет в библиотеке
                lib.get(i).add(book.trim());
                return;
            }
        }
        // добавить новый жанр и книгу
        lib.add(new ArrayList<String>(Arrays.asList(genre.trim())));
        lib.get(lib.size() - 1).add(book.trim());
    }

    // Возвращает жанр книги с названием book. Если книги нет в библиотеке возвращает сообщение:
    // "Книги book нет в библиотеке"
    public String getGenre(String book) {
        for (int i = 0; i < lib.size(); i++) {
            ArrayList<String> bookShelf = lib.get(i);
            if (bookShelf.size() > 1) {
                for (int j = 1; j < bookShelf.size(); j++) {
                    if (bookShelf.get(j).trim().equals(book.trim())) {
                        return String.format("Жанр книги \"%s\" - %s", book.trim(), bookShelf.get(0));
                    }
                }
            }
        }
        return String.format("Книги \"%s\" нет в библиотеке", book.trim());
    }

    // Вернуть все книги жанра genre, если нет такого жанра вернуть пустой массив
    public String[] getBooksByGenre(String genre) {

        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).get(0).equals(genre.trim())) {
                String[] result = new String[lib.get(i).size() - 1];
                for (int j = 0; j < result.length; j++) {
                    result[j] = lib.get(i).get(j + 1);
                }
                return result;
            }
        }
        return new String[]{""};
    }

    // напечатать коллекцию lib
    public void showLib() {
        for (int i = 0; i < lib.size(); i++) {
            ArrayList<String> bookShelf = lib.get(i);
            System.out.printf("%s: ", bookShelf.get(0));
            if (bookShelf.size() > 1) {
                for (int j = 1; j < bookShelf.size() - 1; j++) {
                    System.out.printf("\"%s\", ", bookShelf.get(j));
                }
                System.out.printf("\"%s\"\n", bookShelf.get(bookShelf.size() - 1));
            }
        }
        System.out.println();
    }

    // проверка существует ли genre в коллекции
    private boolean genreIsFound(String genre) {
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).get(0).equals(genre.trim())) {
                return true;
            }
        }
        return false;
    }


}

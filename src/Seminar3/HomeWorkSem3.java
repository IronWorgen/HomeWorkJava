package Seminar3;


import Utility.JustFunction;

import java.util.*;

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

    /*
        Задание №2.1
            Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
            Вывести название каждой планеты и количество его повторений в списке.

        Задание №2.2 (если выполнено первое задание)
            Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
     */

    public void planet() {
        String[] s = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Нептун"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(s[random.nextInt(0, s.length)]);
        }
        System.out.println(list);
        int counter = 0;
        for (String planet : s) {
            for (String i : list) {
                if (planet.equals(i)) {
                    counter++;
                }
            }
            System.out.printf("%s встречается %d раз\n", planet, counter);
            counter = 0;
        }
        System.out.println(list);
        System.out.println(removeDuplicates((ArrayList<String>) list));
    }

    // Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    private ArrayList removeDuplicates(ArrayList<String> list) {
        Collections.sort(list);
        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i + 1).equals(list.get(i))) {
                list.remove(i);

            } else {
                i++;
            }
        }
        return list;
    }
}

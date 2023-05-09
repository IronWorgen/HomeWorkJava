package Seminar5.Task2;

import java.util.*;


public class Task2 {

    /*
    Пусть дан список сотрудников:
    2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
     */
    private List<String> employee;

    public Task2(String names) {

        employee = new ArrayList<>(Arrays.asList(names.split(", ")));
    }

    // вывести повторяющиеся имена с количеством повторений
    public void sortedPrint() {
        Map<String, Integer> employee = namesCount();
        List<String[]> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            if (entry.getValue() != 1) {
                result.add(getIndex(result, entry.getValue()), new String[]{entry.getKey(), entry.getValue().toString()});
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s -> %s%n", result.get(i)[0], result.get(i)[1]);
        }
    }

    //  функция возвращает индекс, на который надо вставить имя сотрудника в результирующий список
    private int getIndex(List<String[]> list, int count) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            if (Integer.parseInt(list.get(0)[1]) > count) {
                return 0;
            } else {
                return 1;
            }
        }

        for (int i = 0; i <= list.size() - 1; i++) {
            if (i == list.size() - 1) {
                return i + 1;
            }
            if (Integer.parseInt(list.get(i)[1]) >= count) {
                return i;
            }
        }
        return -1;

    }

    // функция подсчитывает количество повторяющихся имен.
    private HashMap<String, Integer> namesCount() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < employee.size(); i++) {
            String employeeName = employee.get(i).split(" ")[0];
            if (itsNewName(map, employeeName)) {
                map.put(employeeName, 1);
            } else {
                map.put(employeeName, map.get(employeeName) + 1);
            }
        }

        return (HashMap<String, Integer>) map;
    }


    private boolean itsNewName(Map<String, Integer> names, String name) {
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            if (entry.getKey().equals(name)) {
                return false;
            }
        }
        return true;
    }

}

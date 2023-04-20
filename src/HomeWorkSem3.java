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

}

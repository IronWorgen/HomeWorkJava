import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkSem1 {
    /*
    1. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    */

    public int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        JustFunction.printArray(array);

        return array;
    }

    /*
       2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    */

    public int[] minAndMaxInArray(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        int[] result = {minValue, maxValue};
        JustFunction.printArray(result);
        return result;
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public int[][] createArrayWithOnesOnDiagonal() {
        int[][] array = createSquareArray(5);
        JustFunction.printSquareArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[array.length - 1 - i][i] = 1;
        }
        return array;
    }

    private int[][] createSquareArray(int size) {
        int[][] array = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 10);
            }
        }
        return array;
    }

    /*
    4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     */
    public void helloUser() {
        System.out.println("Как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        int hoursNow = Integer.parseInt(simpleDateFormat.format(date));

        if (hoursNow >= 5 && hoursNow < 12) {
            System.out.printf("Доброе утро, %s!\n", userName);
        } else if (hoursNow >= 12 && hoursNow < 18) {
            System.out.printf("Добрый день, %s!\n", userName);
        } else if (hoursNow >= 18 && hoursNow < 23) {
            System.out.printf("Добрый вечер, %s!\n", userName);
        } else if (hoursNow >= 23 || hoursNow < 5) {
            System.out.printf("Доброй ночи, %s!\n", userName);
        }
    }

    /*
    5.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.
     */

    int[] arrayShift(int[] array, int len) {
        int temp ;
        if (len > 0) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < array.length; j++) {
                    temp = array[array.length - 1];
                    array[array.length - 1] = array[j];
                    array[j] = temp;
                }

            }
        } else {
            len = len * (-1);
            for (int i = 0; i < len; i++) {
                for (int j = array.length - 1; j >= 0; j--) {
                    temp = array[0];
                    array[0] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

import java.util.Random;

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


}

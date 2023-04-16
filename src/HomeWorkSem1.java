

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


}

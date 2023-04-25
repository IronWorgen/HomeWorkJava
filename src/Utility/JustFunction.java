package Utility;

import java.util.LinkedList;
import java.util.Random;

public class JustFunction {

    //  Печать одномерного массива
    public static final void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }

    public static final void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.printf("%s, ", array[i]);
            }
        }
    }

    // Печать двумерного масива
    public static final void printSquareArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.println(array[i][j]);
                } else {
                    System.out.printf("%d, ", array[i][j]);
                }
            }
        }
    }


    //  создать массив длины len со случайными элементами в диапазоне minValue - maxValue.
    public static final int[] createRandomArray(int len, int minValue, int maxValue) {
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minValue, maxValue + 1);
        }
        return array;
    }

    // Печать LinkedList
    public static final void printLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.printf("%d, ", list.get(i));
        }
        System.out.println(list.get(list.size() - 1));
    }


}

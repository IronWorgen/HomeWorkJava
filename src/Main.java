import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HomeWorkSem1 homeWorkSem1 = new HomeWorkSem1();
        // task1
        homeWorkSem1.createArray(5, 3);

        // task2
        int[] array = JustFunction.createRandomArray(10, 0, 10);
        JustFunction.printArray(array);
        homeWorkSem1.minAndMaxInArray(array);

        //task3
        int[][] arr = homeWorkSem1.createArrayWithOnesOnDiagonal();
        System.out.println();
        JustFunction.printSquareArray(arr);

        //task4
        homeWorkSem1.helloUser();

        //task5
        int[] array1 = {3, 5, 6, 1};
        JustFunction.printArray(homeWorkSem1.arrayShift(array1, -2));
    }


}
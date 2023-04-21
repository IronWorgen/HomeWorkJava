import Seminar3.HomeWorkSem3;
import Utility.JustFunction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // seminar 1
        //homeWorkSem1Run();

        // seminar 2
        //homeWorkSem2Run();

        //  seminar 3
        homeWorkSem3Run();

    }

    static void homeWorkSem1Run() {
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

    static void homeWorkSem2Run() {
        HomeWorkSem2 homeWorkSem2 = new HomeWorkSem2();

        //  task1
        System.out.println("Задача №1");
        String query1 = homeWorkSem2.selectQuery(new String[]{"name:Ivanov", "country:Russia", "city:Moscow", "age:null"});
        String query2 = homeWorkSem2.selectQuery(new String[]{"name:null", "country:null", "city:null", "age:null"});
        System.out.println(query1);
        System.out.println(query2);

        //  task2
        System.out.println("\nЗадача №2");
        homeWorkSem2.fileType();
    }

    static void homeWorkSem3Run() {
        HomeWorkSem3 homeWorkSem3 = new HomeWorkSem3();

        //  task1
        System.out.println("\nЗадача №1");
        ArrayList<String> list = homeWorkSem3.createList(1);
        System.out.println(list);
        homeWorkSem3.removeIntegerInList(list);
        System.out.println((list));

        //task2
        System.out.println("\nЗадача №2");
        homeWorkSem3.createLibrary();

    }


}
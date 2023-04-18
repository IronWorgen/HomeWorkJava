import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //HomeWorkSem1Run();
        HomeWorkSem2Run();
    }

    static void HomeWorkSem1Run() {
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

    static void HomeWorkSem2Run() {
        HomeWorkSem2 homeWorkSem2 = new HomeWorkSem2();

        // task1
        String query1 = homeWorkSem2.selectQuery(new String[]{"name:Ivanov", "country:Russia", "city:Moscow", "age:null"});
        String query2 = homeWorkSem2.selectQuery(new String[]{"name:null", "country:null", "city:null", "age:null"});
        System.out.println(query1);
        System.out.println(query2);
    }


}
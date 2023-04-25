package Seminar4;

import java.util.Scanner;

public class UserInterface extends InputQueue {

    public void programStart() {
        boolean finish = false;
        while (!finish) {
            String input = userInput();
            if (input.equals("q")) {
                System.out.println("До встречи!");
                finish = true;
            } else if (input.equals("print")) {
                printQueue();
            } else if (input.equals("revert")) {
                removeLastString();
            } else {
                addItem(input);
            }
        }
    }

    private String userInput() {
        System.out.println("Чтобы посмотреть все записи - введите \"print\" ");
        System.out.println("Чтобы удалить последнюю запись - введите \"revert\"");
        System.out.println("Чтобы завершить работу - введите \"q\"");
        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().trim();
        System.out.println();

        return inputString;
    }


}

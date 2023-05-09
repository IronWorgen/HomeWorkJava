package Seminar4;

import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class InputQueue {
    private ArrayDeque<String> queue;

    InputQueue() {
        queue = new ArrayDeque<>();
    }

    protected void printQueue() {
        if (queue.size() != 0) {
            String[] array = new String[queue.size()];
            queue.toArray(array);
            for (int i = 0; i < queue.size(); i++) {
                System.out.println(array[array.length - 1 - i]);
            }
        } else {
            System.out.println("Очередь пуста");
        }
        System.out.println();
    }

    protected void addItem(String inputString) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        inputString = "\"" + inputString + "\" - " + simpleDateFormat.format(date);
        queue.add(inputString);
    }

    protected void removeLastString() {
        if (queue.size() != 0) {
            queue.removeLast();
        } else {
            System.out.println("Очередь пуста");
        }

    }


}

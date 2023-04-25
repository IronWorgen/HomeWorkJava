package Seminar4;

import java.util.LinkedList;

public class HomeWorkSem4 {

    /*
    1. Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
     */

    public void task1() {
        UserInterface userInterface = new UserInterface();
        userInterface.programStart();
    }

    /*
        2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     */

    public LinkedList<Integer> listReverse(LinkedList <Integer> list){
        list.add(list.get(0));
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size()-1-i, list.get(0));
            list.remove(0);
        }

        return  list;
    }


}

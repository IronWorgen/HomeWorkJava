package Seminar5.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //1. Реализуйте структуру телефонной книги с помощью HashMap,
    // учитывая, что 1 человек может иметь несколько телефонов.


        private Map<String, ArrayList<Integer>> book  = new HashMap<>();

        public void addNumber(String name, int number){
            if(itsNewUser(name)){
                book.put(name, new ArrayList<>(Arrays.asList(new Integer[]{number})));
            }else {
                ((ArrayList<Integer>)book.get(name)).add(number);
            }
        }

        private  boolean itsNewUser(String name){
            for (Map.Entry<String, ArrayList<Integer>> entry : book.entrySet()) {
                if (entry.getKey().equals(name)){
                    return false;
                }
            }
            return  true;
        }

        public void  printBook(){
            for (Map.Entry<String, ArrayList<Integer>> entry : book.entrySet()) {
                System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue().toString());
            }
        }


}

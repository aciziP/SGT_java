package lecture_22_08_tasks;

import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        //Create a new LinkedList object
        //Populate the list with numbers from 1 to 100
        //Print all the elements in the LinkedList

        LinkedList<Integer> list  = new LinkedList<>();

        for(int i = 1; i<=100; i++){
            list.add(i);
        }

        System.out.println(list);
    }
}

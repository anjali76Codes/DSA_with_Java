package DSA_with_Java.LinkedList_Exercise;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class ConcatenateList {

    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
        List<Object> concatenatedList = new LinkedList<>(listOne); // Create a new list with elements of listOne

        Iterator<Object> descendingIterator = ((LinkedList<Object>) listTwo).descendingIterator();
        while (descendingIterator.hasNext()) {
            concatenatedList.add(descendingIterator.next());
        }

        return concatenatedList;
    }

    public static void main(String args[]) {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);

        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");

        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");
        for (Object value : concatenatedList) {
            System.out.print(value + " ");
        }
    }
}
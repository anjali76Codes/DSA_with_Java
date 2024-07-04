package HashMap_Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Tester {

    public static List<Integer> removeDuplicates(List<Integer> list) {

        List<Integer> updatedList = new ArrayList<>();

        for (Integer value : list) {
            if (!updatedList.contains(value)) {
                updatedList.add(value);
            }
        }

        return updatedList;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates");
        for (Integer value : updatedList) {
            System.out.print(value + " ");
        }
    }
}

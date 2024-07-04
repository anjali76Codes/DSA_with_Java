package HashMap_Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SortedOrderLists {

    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {

        List<Integer> mergedList = new LinkedList<>();

        int totalsize = listOne.size() + listTwo.size();
        int i = 0;
        int j = 0;
        for (int k = 0; k < totalsize; k++) {
            if (i < listOne.size() && j < listTwo.size()) {
                if (listOne.get(i) < listTwo.get(j)) {
                    mergedList.add(listOne.get(i));
                    i++;
                } else {
                    mergedList.add(listTwo.get(j));
                    j++;
                }
            } else if (i < listOne.size()) {
                mergedList.add(listOne.get(i));
                i++;
            } else if (j < listTwo.size()) {
                mergedList.add(listTwo.get(j));
                j++;
            }
        }

        // Implement your logic here and change the return statement accordingly

        return mergedList;

    }

    public static void main(String args[]) {
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(13);
        listOne.add(21);
        listOne.add(42);
        listOne.add(56);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(15);
        listTwo.add(20);
        listTwo.add(21);
        listTwo.add(85);
        listTwo.add(92);

        List<Integer> mergedList = mergeLists(listOne, listTwo);
        System.out.println(mergedList);
    }
}

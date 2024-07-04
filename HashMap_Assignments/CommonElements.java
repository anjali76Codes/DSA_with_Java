package HashMap_Assignments;

import java.util.LinkedList;
import java.util.List;

class CommonElements {

	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo) {

		for (Integer one : listOne) {
			for (Integer two : listTwo) {
				if (one.equals(two)) {
					System.out.print(one + " -> ");
				}
			}
		}

		return null;

		// Implement your logic here and change the return statement accordingly

	}

	public static void main(String arga[]) {

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);

		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}

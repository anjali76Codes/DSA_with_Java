package QueueInterface;

import java.util.Deque;
import java.util.ArrayDeque;

class SmallestAtBottom {

	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		Deque<Integer> updatedStack = new ArrayDeque<>();

		updatedStack.add(inputStack.remove());
		while (!inputStack.isEmpty()) {
			int current = inputStack.remove();

			if (current <= updatedStack.peekLast()) {
				updatedStack.addLast(current);
			}

			else {
				updatedStack.addFirst(current);
			}
		}

		// Implement your logic here and change the return statement accordingly
		return updatedStack;
	}

	public static void main(String[] args) {

		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
		System.out.println(inputStack);

		Deque<Integer> updatedStack = changeSmallest(inputStack);

		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}

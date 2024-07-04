package HashMap_Assignments;

// Node class representing a single node in the linked list
class Node {
	String data;
	Node next;

	// Constructor to create a new node
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
}

// Queue class implementing a queue using a linked list
class Queue {
	private Node front; // Points to the front of the queue
	private Node rear; // Points to the rear of the queue
	private int size; // Current size of the queue
	private int capacity; // Maximum capacity of the queue

	// Constructor to initialize an empty queue with a given capacity
	public Queue(int capacity) {
		this.front = null;
		this.rear = null;
		this.size = 0;
		this.capacity = capacity;
	}

	// Method to check if the queue is empty
	public boolean isEmpty() {
		return front == null;
	}

	// Method to check if the queue is full
	public boolean isFull() {
		return size == capacity;
	}

	// Method to add an element to the queue
	public void enqueue(String data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}

		Node newNode = new Node(data); // Create a new node with the given data

		if (rear == null) {
			front = rear = newNode; // If the queue is empty, both front and rear will point to the new node
		} else {
			rear.next = newNode; // Link the new node to the end of the queue
			rear = newNode; // Update the rear to point to the new node
		}

		size++; // Increment the size of the queue
	}

	// Method to remove an element from the queue
	public String dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null; // Return null if the queue is empty
		}

		String data = front.data; // Get the data from the front node
		front = front.next; // Update the front to point to the next node

		if (front == null) {
			rear = null; // If the queue becomes empty, update rear to null
		}

		size--; // Decrement the size of the queue
		return data;
	}

	// Method to get the current elements of the queue
	public String getQueue() {
		if (isEmpty()) {
			return "Queue is empty";
		}

		StringBuilder sb = new StringBuilder();
		Node temp = front;
		while (temp != null) {
			sb.append(temp.data).append(" ");
			temp = temp.next;
		}
		return sb.toString().trim();
	}
}

// Tester class to test the queue implementation
class QueueUsingLinkedList {

	public static void main(String[] args) {
		Queue queue = new Queue(5);

		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");

		queue.dequeue();
		queue.dequeue();

		System.out.println(queue.getQueue()); // Output: Rachel Rose
	}
}

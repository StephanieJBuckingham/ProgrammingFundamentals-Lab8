/* Exercise 1
 * 
 * Modify the main method of the Driver class from Lab #7. In this method, do the following:
 * 1. Create instances of an ArrayQ and a LinkedQueue
 * 2. Enqueue the following int's onto the two queues: (1,7,3,4,9,2)
 * 3. Dequeue all the elements from the queues, displaying each int as it's removed
 * 
 * Exercise 2
 * 
 * Modify the LinkedQueue class to include a new method called removeMiddle, which
 * removes from the queue the value that is in the middle.
 * For example, if the queue contains 3, 7, 2, 4, 5, then 2 will be removed.
 * If the queue contains 2, 9, 1, 4 (even number of values), then remove 9 (round down).
 * Test the method using the Driver program.
 */

public class Driver {

	public static void main(String[] args) {
		
		// Create instance of ArrayQ
		ArrayQ arrayQ = new ArrayQ();

		// Add(enqueue) integers into ArrayQ
		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);

		// Remove(dequeue) elements one by one and displaying each removal
		int i = 1;
		while (!arrayQ.isEmpty()) {
			System.out.println("Step " + i + " remove " + arrayQ.dequeue());
			i++;
		}

		// Print message that queue is empty
		System.out.println("Queue is now empty. \n");

		// Create instance of LinkedQueue
		LinkedQueue linkedQueue = new LinkedQueue();
		
		// Add(enqueue) integers into LinkedQueue
		linkedQueue.enqueue(1);
		linkedQueue.enqueue(7);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(4);
		linkedQueue.enqueue(9);
		linkedQueue.enqueue(2);

		// Remove(dequeue) elements one by one and displaying each removal
		int j = 1;
		while (!linkedQueue.isEmpty()) {
			System.out.println("Step " + j + " remove " + linkedQueue.dequeue());
			j++;
		}

		// print message that queue is empty
		System.out.println("Stack is now empty. \n");
		
		// Create instance of LinkedQueue2 for Exercise 2 
		LinkedQueue linkedQueue2 = new LinkedQueue();
		
		// Add(queue) integers into LinkedQueue2
		linkedQueue2.enqueue(1);
		linkedQueue2.enqueue(2);
		linkedQueue2.enqueue(3);
		linkedQueue2.enqueue(4);
		linkedQueue2.enqueue(5);

		// Call method removeMiddle on LinkedQueue2
		linkedQueue2.removeMiddle();
		
	
	}
}

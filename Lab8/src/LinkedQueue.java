/* Exercise 2
 * 
 * Modify the LinkedQueue class to include a new method called removeMiddle, which
 * removes from the queue the value that is in the middle.
 * For example, if the queue contains 3, 7, 2, 4, 5, then 2 will be removed.
 * If the queue contains 2, 9, 1, 4 (even number of values), then remove 9 (round down).
 * Test the method using the Driver program.
*/

// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	private char[] toString;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		return str;
	}

	public void removeMiddle() {

		LinkedQueue temp = new LinkedQueue();

		int half = count / 2;

		// Remove(dequeue) elements one at a time
		// Add(enqueue) removed(dequeued) elements to new temporary LinkedQueue
		while (size() > 0) {
			int newInts = dequeue();
			temp.enqueue(newInts);

			// When (size -1) of original LinkedQueue equal half, remove(dequeue) element
			// Size - 1 ensures you remove middle element rounded down on even queue lengths
			if (size() - 1 == half) {
				dequeue();
			}
		}

		// Loop to transfer elements from temporary LinkedQueue back to original
		// LinkedQueue
		while (temp.size() > 0) {
			enqueue(temp.dequeue());
		}

		// Prints out new LinkedQueue with middle removed
		System.out.println(toString());
	}
}

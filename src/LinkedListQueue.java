//Mike Vealey
//CSIT 211

import java.util.EmptyStackException;
import java.util.LinkedList;


public class LinkedListQueue {

	private static LinkedList<Integer> elementList;
	
	public LinkedListQueue() {
		elementList = new LinkedList<Integer>();
	}
	
	
	//enqueue
		public void enqueue(int iElement) {
			elementList.addLast(iElement);
		}
	
	//dequeue
		public int dequeue() {
			int element;
			if (!elementList.isEmpty()) {
				element = elementList.removeFirst();
			} else {
				throw new EmptyStackException();
			}
			return element;	
		}
	
	//first
		public int first() {
			return elementList.getFirst();
		}
	
	//isEmpty
		public boolean isEmpty() {
			return elementList.isEmpty();
		}
	
	//size
		public int size() {
			return elementList.size();
		}
	
	//toString
		public String toString() {
			return elementList.toString();
		}

}

//Mike Vealey
//CSIT 211

public class LinkedListQueueDriver {

	public static void main(String[] args) {

		LinkedListQueue myQueue = new LinkedListQueue();		
		
		//enqueue
			myQueue.enqueue(1);
			myQueue.enqueue(2);
			myQueue.enqueue(3);
			
			System.out.println("toString = " + myQueue.toString());
		
		//dequeue
			System.out.println("dequeue = " + myQueue.dequeue());
		
		//first
			System.out.println("first = " + myQueue.first());
		
		//isEmpty
			if(myQueue.isEmpty()) {
				System.out.println("The queue is empty.");
			} else {
				System.out.println("The queue is not empty.");
			}
		
		//size
			System.out.println("size = " + myQueue.size());
		
		//toString
			System.out.println("toString = " + myQueue.toString());
		
	}

}

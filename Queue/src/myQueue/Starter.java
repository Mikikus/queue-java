package myQueue;

public class Starter {
	public static void main(String[] args){
		Queue queue = new Queue(5);
		System.out.println("Block: START:");
		queue.insert(49); // tale 0 | head 0
		queue.insert(73); // tale 1 | head 0
		queue.insert(32); // tale 2 | head 0
		queue.insert(24); // tale 3 | head 0
		queue.insert(96); // tale 4 | head 0
		queue.show();
		System.out.println(" ");

		System.out.println("Block: Remove 3:");
		queue.remove(); // tale 4 | head 1
		queue.remove(); // tale 4 | head 2
		queue.remove(); // tale 4 | head 3
		queue.show();
		System.out.println(" ");

		System.out.println("Block: Insert 3");
		queue.insert(92); // tale 5->0 | head 3
		queue.insert(18); // tale 1 | head 3
		queue.insert(19); // tale 2 | head 3
		queue.show();
		System.out.println(" ");

		System.out.println("Block: Remove 1");
		queue.remove(); // tale 2 | head 4
		queue.remove(); // tale 2 | head 0
		queue.remove();
		queue.remove();
		queue.remove();

		queue.show();

	}
}

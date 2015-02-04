package linear;

public class TestLLmethods {
	public static void main(String args[])
	{
		LLmethods ll = new LLmethods();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		
		System.out.println("Linked List:" + ll);
		System.out.println("item: " + ll.get(2));
		ll.remove(2);
		System.out.println("New Linked List:" + ll);
	}

}

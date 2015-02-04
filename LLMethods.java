public class LLmethods {
	
	private Node head; //reference to the head node
	private int ListCount = 0;
	
	
	public LLmethods()
	{	//this is an empty list so the reference to head is set to new node
		head = new Node(null);
		ListCount = 0;
	}
	
	/*appends the specified element to the end of the list*/
	public void add(Object data)
	{
		Node temp = new Node(data);
		Node current = head;
		
		//start at the head and crwl to the end of the list
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		//the last node reference is set to our new node
		current.setNext(temp); 
		ListCount++; //increment the number of elements variable;
	}
	
	/*insert the element at a specified position in the list*/
	public void add(Object data, int index)
	{
		Node temp = new Node(data);
		Node current = head;
		//crawl to the index aur end of the list whichever comes first
		for(int i = 1; i < index && current.getNext() != null; ++i)
		{
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		ListCount++;
	}
	
	public Object get(int index)
	{
		if(index <= 0)
			return null;
		Node current = head.getNext();
		for(int i = 1; i < index; ++i)
		{
			if(current.getNext() == null)
				return null;
			current = current.getNext();
		}
		return current.getData();
	}
	
	public int size()
	{
		return ListCount++;
	}
	
	
	public boolean remove(int index)
	{
		if(index < 1 || index > size())
			return  false;
		Node current = head;
		for(int i = 1; i < index; ++i)
		{
			if(current.getNext() == null)
				return false;
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		ListCount--;
		return true;
	}
	
	public String toString() {
	        Node current = head.getNext();
	        String output = "";
	        while (current != null) {
	            output += " " + current.getData().toString() + " ";
	            current = current.getNext();
	        }
	        return output;
	    }
	 
	 

}

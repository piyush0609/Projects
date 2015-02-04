A basic implementation of Singly Linked List in JAVA

package linear;
public class Node {
	
	//data carried by the node, could be of any type 
	Object data;
	
	//reference to next node in chain
	//or NULL if there isnt any
	Node next;
	
	public Node(Object data) //when only data is passed next is set to NULL
	{
		next = null;
		this.data = data;
		
	}
	
	//Node constructor if we want to specify the node to point to
	public Node(Object data, Node next)
	{
		this.next = next;
		this.data = data;
	}
	
	/*Getters and Setters */
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

	
	
	


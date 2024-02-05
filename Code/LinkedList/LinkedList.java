package camp;

public class LinkedList {
    class Node{
    	int data;
    	Node next;
    	
    	public Node(int data) {
    		this.data = data;
    		this.next = null;
    	}
    }
    	
    public Node head = null;
    public Node tail = null;
    	
    public void insert(int data) {
    	
    	// creating a new node
    	
    	Node newNode = new Node(data);
    	
    	if(head == null) {
    		head = newNode;
    		tail = newNode;
    	}
    	else {
    		tail.next = newNode;
    		tail = newNode;
    	}
    }
    public void delete(int data) {
    	Node h = head,prev = null;
    	if(h == null) {
    		System.out.println("The list is empty, the node can't be deleted");
    	}
    	if(h.data == data) {
    		head = h.next;
    		return;
    	}
    	while(h != null && h.data != data) {
    		prev = h;
    		h = h.next;
    	}
    	prev.next = h.next;
    	
    }
    
    public void display() {
    	Node current = head;
    	
    	if(head == null) {
    		System.out.println("The given list is empty");
    		return;
    	}
    	System.out.println("The given list are as follows: ");
    	
    	while(current!=null) {
    		System.out.print(current.data +" ");
    		current = current.next;
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList newList = new LinkedList();
		//adding more elements to the linked list
		 newList.insert(10);    
		 newList.insert(30);   
		 newList.insert(50); 
		 newList.insert(70); 
		 newList.insert(100);
		 //deletion
		 newList.delete(30);
		 //display the linked list
		 newList.display();
	}

}

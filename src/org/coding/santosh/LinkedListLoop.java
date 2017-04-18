package org.coding.santosh;

public class LinkedListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result= false;
	Node head = new Node(1,null);
	Node n1 = new Node(2,null);
	Node n2 = new Node(3,null);
	Node n3 = new Node(4,null);
	Node n4 = new Node(5,null);
	Node n5 = new Node(6,null);
	Node n6 = new Node(7,null);
	head.setNext(n1);
	n1.setNext(n2);
	n2.setNext(n3);
	n3.setNext(n4);
	n4.setNext(n5);
	n5.setNext(n6);
	n6.setNext(n2);
	LinkedListLoop l = new LinkedListLoop();
	result = l.detectLoop(head);
	if(result)
		System.out.println("There is a loop in the Linked List");
	else 
		System.out.println("There is no loop in the Linked List");
	}
	
	
	public boolean detectLoop(Node head)
	{
		if(head == null)
			return false;
		
		Node sp = new Node();
		Node fp = new Node();
		Node temp= new Node();
		sp = head;
		fp = head;
		//boolean result;
		while(fp.next != null)
		{
			temp = fp;
			sp = sp.next;
			fp = fp.next.next;
			
			
			if(fp.next != null && fp.next.equals(sp))
			{
				System.out.println("The Node where loop started is " +temp.next.value);
				return true;
			}	
		}
		return false;
	}
}

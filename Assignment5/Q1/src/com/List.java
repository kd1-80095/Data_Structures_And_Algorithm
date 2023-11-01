package com;

public class List {

	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = null;
			prev = null;
		}		
	}

	private Node head;
	private int count;
	
	public List()
	{
		head = null;
		count = 0;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value) {
		
		Node nn = new Node(value);
		
		if(isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		
		else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
		count++;
	}
	
	public void addPosition(int value , int pos)
	{
		if(pos<1||pos>count+1)
		{
			System.out.println("Invalid");
			return;
		}
		Node newnode = new Node(value);
		
		 if(isEmpty())
			{
				head = newnode;
				head.next=newnode;
				head.prev=newnode;
				count++;
			}
		 else if(pos ==1)
		{
			addFirst(value);
		}
		
		else
		{	
			Node trav = head;
			
			for(int i=1;i<pos -1 ;i++)
			{
				trav = trav.next;
			}
			
			newnode.next = trav.next;
			newnode.prev = trav;
			trav.next = newnode;
			trav.next.next.prev=newnode;
			count++;
		}
		
	}
	public void deleteFirst()
	{
		if(isEmpty())
			return ;
		else if(head.next == head)
			head = null;
		else
		{
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
			count--;
		}
		
		
	}
	
	public void deleteAtPosition(int pos)
	{
		if(isEmpty())
		{
			return;
		}
		else if(pos==1)
		{
			deleteFirst();
		}
		
		else if(head.next==head)
		{
			head = null;
			count--;
		}
		
		else
		{
			Node trav = head;
			for(int i = 1  ; i < pos ; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			//c. add pos -1 node into prev of pos + 1 node 
			trav.next.prev = trav.prev;
		}
	}
	
	
	public void display() {
		
		Node trav = head;
		System.out.print("Forward : ");
		 do{
			System.out.print(" " + trav.data);
			
			trav = trav.next;
		}while(trav != head);
		System.out.println("");
	}
	
	
	
}

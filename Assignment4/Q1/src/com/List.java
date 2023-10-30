package com;

public class List {

	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) {
			
			this.data = data;
			next = null;
		}
		
	}
	private Node head;
	private Node tail;
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
			tail = newnode;
		}
	}

	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
		}
		else 
		{
			Node trav = head;
			while(trav.next !=null)
			{
				trav = trav.next;
			}
			
			trav.next = newnode;
		}
	}
	
	public void displayList()
	{
		Node trav = head;
		System.out.println("List:");
		
		while(trav != null)
		{
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
	
}



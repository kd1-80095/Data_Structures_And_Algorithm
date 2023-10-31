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
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
			
		}
	}

	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else 
		{
			Node trav = head;
			while(trav.next !=null)
			{
				trav = trav.next;
			}
			
			trav.next = newnode;
			tail = newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else 
		{
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(head.next==null)
		{
			head =null;
		}
		else
		{
			Node trav = head;
			while(trav.next.next !=null)
			{
				trav = trav.next;
			}
			tail = trav;
			trav.next =null; // tail.next = null
			
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



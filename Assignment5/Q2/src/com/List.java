package com;

public class List {

	class Node
	{
		private int data;
		private Node next;

		
		public Node(int value)
		{
			data = value;
			next = null;

		}
	}
	private Node head;
	
	public List()
	{
		head = null;
	}
	public boolean isEmpty()
	{
		return head==null; 
	}
	
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		if(head==null)
		{
			head = nn;
			
		}
		else		{
			nn.next = head;
			head=nn;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("Empty");;
		}
		else
		{
			head=head.next;
			
		}
	}
	
	public int getData()
	{
		
		return head.data ;
	}
	
}

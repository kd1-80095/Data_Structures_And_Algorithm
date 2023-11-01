package com;

import java.util.Scanner;

class Stack
{
	private List l1 ;
	
	public Stack()
	{
		l1=new List();
	}
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void push(int value)
	{
		l1.addFirst(value);
	}
	
	public void pop()
	{
		l1.deleteFirst();
	}
	public int peek()
	{
		return l1.getData();
	}
	
}


public class Main {
	static int menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("0 = Exit");
		System.out.println("1 = Push");
		System.out.println("2 = Pop");
		System.out.println("3 = Peek");
		System.out.println("Enter Choice:");			
		int choice =sc.nextInt();
		return choice ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack();
		int choice;
		
		while((choice=menu())!=0)
		{
			
			switch(choice)
			{
			case 1 :
			{
				System.out.println("Enter number to Push");
				int num = sc.nextInt();
				s1.push(num);
			}
			break;
			
			case 2 :
			{
				s1.pop();
			}
			break;
		
			case 3 :
			{
				System.out.println("Peeked number: "+s1.peek());
				
			}
			break;
			default:
				System.out.println("Enter Valid Choice.");
				break;
			}
		}

	}

}

package com;

public class DLLL {

	public static void main(String[] args) {
		
	List l1 = new List();
	
//	l1.addFirst(55);
//	l1.addPosition(20,1);
//	l1.addPosition(10,3);
	l1.addPosition(40, 1);
	l1.addPosition(50, 2);
	l1.addPosition(30, 1);
	l1.display();
	l1.deleteAtPosition(3);
	l1.display();
	
	}
}

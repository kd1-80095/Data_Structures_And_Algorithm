package com.queue;


public class Queue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		// a. reposition rear (inc)
		rear++;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public int pop() {
		return front++;
	}
	
	public int peek() {
		//a. read/return data of front + 1 index
		return arr[front + 1];
	}
	
	public boolean isFull() {
		return rear == SIZE -1;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}







package com;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int size,int key)
	{
		int cnt =0;
		for(int i=0;i<size;i++)
		{
			cnt++;
			if(arr[i]==key)
			{
				System.out.println("no of comparisions done:"+cnt);
				return i;
			}
		}
		System.out.println("no of comparisions done:"+cnt);
		return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {78,63,52,55,10,98,70};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search:");
		
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		if (index!=-1)
		{
			System.out.println("Key Found at Index :"+ index);
		}
		else
		{
		System.out.println("Key not found.");
		}
	}

}

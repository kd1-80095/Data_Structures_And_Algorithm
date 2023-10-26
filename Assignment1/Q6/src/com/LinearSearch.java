package com;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int size,int key)
	{
		int cnt =-1;
		for(int i=0;i<size;i++)
		{
			cnt++;
			if(arr[i]==key)
				break;
		
		}
		
		return cnt;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 3, 4, 4, 1 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search:");
		
		int key = sc.nextInt();
		
		int index = linearSearch(arr, arr.length, key);
		
			System.out.println("Rank of key :"+ (index ));
		
	}

}

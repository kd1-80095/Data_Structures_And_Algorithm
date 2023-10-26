package com;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int []arr, int size,int key)
	{
		int left =0, right = size-1,mid,cnt=0;
		
		while(left<=right)
		{
			cnt++;
			mid = (left +right)/2;
			if(key == arr[mid])
			{		
				System.out.println("no of comparisions done:"+cnt);
				return mid;
			}	
			else if(key<arr[mid])
				right = mid -1;
			else
				left = mid+1;
		}
		System.out.println("no of comparisions done:"+cnt);
		return -1;
		
	}

	public static void main(String[] args) {
	
		int arr[] = {10,30,40,45,50,70}; // sorted array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search:");
		
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		
		if(index !=-1)
		{
			System.out.println("Key Found at index:"+index);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

}

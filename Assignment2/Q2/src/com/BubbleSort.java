package com;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static int bubbleSort(int arr[],int N)
	{
		int cnt=0;
		for(int i = 1; i<N;i++) // no of passes
		{
			
			for(int j=0;j<N-i;j++)
			{
				cnt++;//comparisions
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return cnt;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {55,23,98,66,23,40};
		
		
		System.out.println("Arrays before Sort :"+Arrays.toString(arr));
		int cnt =bubbleSort(arr,arr.length);

		System.out.println("Arrays After Sort:"+Arrays.toString(arr));
		
		System.out.println("No of comparisions:"+cnt);
	}

}

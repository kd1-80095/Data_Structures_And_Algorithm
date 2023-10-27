package com;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static int selectionSort(int arr[],int N)
	{
		int cnt=0;
		for(int i = 0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				cnt++;
				if (arr[i]>arr[j] )
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		return cnt;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {55,23,98,66,35,40};
		
		System.out.println("Arrays before Sort :"+Arrays.toString(arr));
		int cnt =selectionSort(arr,arr.length);

		System.out.println("Arrays After Sort:"+Arrays.toString(arr));
		
		System.out.println("No of comparisions:"+cnt);
		

	}

}

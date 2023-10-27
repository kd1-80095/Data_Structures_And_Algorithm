package com;

import java.util.Arrays;

public class InsertionSort {
	public static int insertionSort(int arr[],int N)
	{
		int cnt=0;
		for(int i=1;i<N;i++)
		{	
			int temp = arr[i];
			int j = i-1;
			while(j>=0) 
			{
				cnt++;
				if(arr[j]>temp)
				{
					arr[j+1] = arr[j];
				
					j--;
				}
				else 
				{
					break;
				}
			}
			arr[j+1] = temp;
		}
		return cnt;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {55,44,22,66,11,33};
		System.out.println("Arrays before Sort :"+Arrays.toString(arr));
		int cnt =insertionSort(arr,arr.length);

		System.out.println("Arrays After Sort:"+Arrays.toString(arr));
		
		System.out.println("No of comparisions:"+cnt);

	}

}

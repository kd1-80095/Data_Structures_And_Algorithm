package com;

import javax.swing.RepaintManager;

/*find the first non-repeating element:
Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
Ouput: 3
*/
public class Main {

	public static int repeating(int arr[],int size)
	{
		int key;
		for(int i=0;i<size;i++)
		{
			key=arr[i];
			for (int j=i+1;j<size;j++)
			{
				if (key==arr[j])
				{
					
					System.out.println(arr[i]);
				}
				
			}
			//System.out.println(arr[i]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		int index = repeating(arr, arr.length);
	}

}

package com;

import javax.swing.RepaintManager;

/*find the first non-repeating element:
Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
Ouput: 3
*/
public class Main {

	public static int repeating(int arr[], int size) {
		int ele;
		
		for (int i = 0; i < size; i++) {
			ele = arr[i];
			for (int j = i + 1; j < size; j++) {
				
				if (ele == arr[j])
					ele=0;
				
			}
			if (ele != 0) {
				return i;

			}

		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		//int arr[] = {777,359,777,359,656};
		int index = repeating(arr, arr.length);
		System.out.println(arr[index]);
	}

}

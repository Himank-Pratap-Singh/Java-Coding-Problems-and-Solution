package Basic_Java;

import java.util.Scanner;

//Find if an element is present in the array or not.

public class Array2 {

	static int findElement (int arr[], int n, int x) {
		for(int i = 0; i < n ; i++) {
			if (arr[i] == x) 
				return i;
			}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
//		int res = -2147483647;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			}
		int x = sc.nextInt();
		
		int result = findElement(arr, arr.length, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
  
		
		

	}

}

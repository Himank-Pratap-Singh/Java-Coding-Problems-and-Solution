package Basic_Java;

import java.util.Scanner;

public class linearSearch {
	
	public static void linearEx(int arr[], int item) {
		int flag = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				System.out.println("the Item is found at index:- " +i );
				break;
			}
		flag ++;
		if (flag > arr.length)
			System.out.println("the item is not present in array");
		}			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {3, 5, 7, 2, 8, 6, 0};
		System.out.println("Enter the item you want to search:- ");
		int item = sc.nextInt();
		linearEx(arr, item); 
}
}

package Basic_Java;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of Element you want to insert in Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the no in the array: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println(" the Sum of array is " + sum);
	}
}

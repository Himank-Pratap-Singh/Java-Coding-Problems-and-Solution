package Basic_Java;

import java.util.Scanner;

public class FindArrElement {

	public static void main(String[] args) {
		int n, i, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no Elent you Want to enter to Array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element in array: ");
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		
	}

}

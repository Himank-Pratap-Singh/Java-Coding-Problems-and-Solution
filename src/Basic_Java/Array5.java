// copy all element of array to another
package Basic_Java;

import java.util.Scanner;

public class Array5 {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr2 = new int[n];
	    int[] arr1 = new int[n];
	    System.out.println("Elemnt in array 1:- ");
	    for(int i = 0 ; i < n ; i++) {
	        arr1[i] = sc.nextInt();
	        }
	    System.out.println("Element in array2 :- ");
	    for(int i = 0; i < n; i++) {
	    	arr2[i] = arr1[i];
	    	System.out.print(arr2[i] + " ");
	    }

	}
}

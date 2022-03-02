package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Recursion2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(System.in);
	
	// Replace a char in string . remove x
	public static String replaceChar(String str, char a, char b) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String smallOutput = replaceChar(str.substring(1), a, b);
		
		if(str.charAt(0) == a) {
			return b + smallOutput;
		}
		else {
			return str.charAt(0) + smallOutput;
		}
		
	
	}
	
	// Replace pi from the string to 3.14
	public static String replacePi(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i' ) {
			//Call recursion on string of length n - 2.
			String smallOutput = replacePi(str.substring(2));
			return "3.14" + smallOutput;
		}
		else {
			//Call recursion on string of length n - 1.
			String smallOutput = replacePi(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
		
	}
	
	// Remove duplicates recursively
	public static String removeConsecutiveDuplicates(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		
		if(str.charAt(0) == str.charAt(1)) {
			String smallOutput = removeConsecutiveDuplicates(str.substring(1));
			return  smallOutput;
		}
		else {
			String smallOutput = removeConsecutiveDuplicates(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
		
	}
	
	// Binary search recursion example
	public static int binarySearch(int arr[], int si, int ei, int x) {
		
		if(si > ei) {
			return -1;
		}
		
		int midIndex = (si + ei)/2;
		if(arr[midIndex] == x) {
			return midIndex;
		}
		else if(arr[midIndex] < x) {
			return binarySearch(arr, midIndex + 1, ei, x);
		}
		else {
			return binarySearch(arr, si, midIndex - 1, x);
		}
		
	}
	
	// Merge sort coding example
	
	// merge function to add add two sorted array
	
	public static void merge(int b[], int c[], int a[]) {
		int i = 0, j = 0, k = 0;
		
		while(i < b.length && j < c.length) {
			if(b[i] < c[j]) {
				a[k] = b[i];
				i++;
				k++;
			}
			else {
				a[k] = c[j];
				k++;
				j++;
			}
		}
		
		if(i < b.length) {
			while(i < b.length) {
				a[k] = b[i];
				i++;
				k++;
			}
		}
		
		if(j < c.length) {
			while(j < c.length) {
				a[k] = c[j];
				j++;
				k++;
			}
		}
		
	}
	
	// merge sort function to divide the array into two separate array and sort them
	public static void mergeSort(int a[]) {
		
		int n = a.length;
		if(n <= 1) {
			return;
		}
		
		int b[] = new int[a.length/2];
		int c[] = new int[a.length - b.length];
		
		for(int i = 0; i < a.length/2; i++) {
			b[i] = a[i];
		}
		
		for(int i = a.length/2; i < a.length; i++) {
			c[i - a.length/2] = a[i];
		}
		
		mergeSort(b);
		mergeSort(c);
		merge(b, c, a);
		
	}
	
	// Function for implementing quick sort Using Recursion
	
	public static int partition(int a[], int si, int ei) {
		
		int pivotElement = a[si];
		int smallerNoCount = 0;
		
		for(int i = si + 1; i <=ei; i++) {
			if(a[i] < pivotElement) {
				smallerNoCount++;
			}
		}
		
		int temp = a[si + smallerNoCount];
		a[si + smallerNoCount] = pivotElement;
		a[si] = temp;
		
		int i = si;
		int j = ei;
		while(i < j) {
			if(a[i] < pivotElement) {
				i++;
			} else if(a[j] >= pivotElement) {
				j--;
			}
			else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		return si + smallerNoCount;
	}
	
	public static void quickSort(int a[], int si, int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int pivotIndex = partition(a, si, ei);
		quickSort(a, si, pivotIndex - 1);
		quickSort(a, pivotIndex + 1, ei); 
		
	}
	
	public static void quickSort(int a[] ) {
		quickSort(a, 0, a.length - 1);
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
//		String str = br.readLine();
//		char a = sc.next().charAt(0);
//		char b = sc.next().charAt(0);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		Arrays.sort(arr);
	
//		int x = sc.nextInt();
		
//		System.out.println(replaceChar(str, a, b));
//		System.out.println(replacePi(str));   
//		System.out.println(removeConsecutiveDuplicates(str));
//		System.out.println(binarySearch(arr, 0, arr.length - 1, x));
//		mergeSort(arr);
		quickSort(arr);
		 
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}

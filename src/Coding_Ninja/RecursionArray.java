package Coding_Ninja;

import java.util.Scanner;

public class RecursionArray {

	static Scanner s = new Scanner(System.in );
	
	public static int Solution(int x, int n) {
		if(n == 0)
			return 1;
		int recur = Solution(x, n - 1);
		int output = x * recur;
		return output;
	}
	
	public static void print(int n){
		if(n == 0){
			return;
		}
//		if(n == 1){
//			System.out.print(n + " ");
//		}  
		System.out.print(n+" ");
	}
	
	//check for sorted array
	 public static boolean isSorted(int a[]) {
		 if(a.length == 1) {
			 return true;
		 }
		 if(a[0] > a[1]) {
			 return false;
		 }
		 
		 int copyArray[] = new int[a.length - 1];
		 for(int i = 0; i < copyArray.length; i++) {
			 copyArray[i] = a[i+1]; 
		 }
		 
		 boolean isCopyArraySorted = isSorted(copyArray);
		 return isCopyArraySorted;
		 
		 }
	 
	 // sum of Array
	static int out = 0; 
	public static int sum(int input[]) {
		
		int n = input.length;
		if(n == 0) {
			return 0;
		}
		
		out = out + input[0];
		
		int copyArray[] = new int[input.length - 1];
		 for(int i = 0; i < copyArray.length; i++) {
			 copyArray[i] = input[i+1]; 
		 }
		 sum(copyArray);
		 return out;
	}
	
	public static boolean checkNumber(int input[], int x) {
		
		int n = input.length;
		if(n == 1) {
			return false;
		}
		
		if(input[0] == x) {
			return true;
		}
		
		int copyArray[] = new int[input.length - 1];
		for(int i = 0; i < copyArray.length; i++) {
			 copyArray[i] = input[i+1]; 
		 }
		
		boolean isFound = checkNumber(copyArray, x);
		return isFound;
	}
	
	//Check for sorted array method 2
	public static boolean isSortedBetter(int arr[], int si) {
		
		if(si == arr.length - 1) {
			return true;
		}
		if(arr[si] > arr[si + 1]) {
			return false;
		}
		boolean isSmallArraySorted = isSortedBetter(arr, si + 1);
		
		return isSmallArraySorted;
	}
	
	
	// First Index of a No in an Array
	static int res = 0;
	public static int firstIndexArray(int arr[], int x) {
//		int res = 0;
		int n = arr.length;
		if(res == arr.length - 1){
			return -1;
		}
		if(x == arr[res]) {
			return res;
		}
		res++;
		int output = firstIndexArray(arr, x);
		
		return output;
	}
	
	
	//Last index of a number in an array
	public static int lastIndexArray(int arr[], int x) {
		
		int n = arr.length;
		if(n == 0) {
			return -1;
		}
		int copyArray[] = new int[arr.length - 1];
		for(int i = 0; i < copyArray.length; i++) {
			 copyArray[i] = arr[i+1]; 
		 }
		int ans = lastIndexArray(copyArray, x);
		if(ans != -1) {
			return ans + 1;
		}else {
			if(arr[0] == x) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
	}
	
	public static void main(String[] args) {
//		int x = s.nextInt();
//		int n = s.nextInt();
//		int no = s.nextInt();
//		int si = s.nextInt();

		
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		int x = s.nextInt();
		
		int si = 0 ;
		
//		System.out.println(Recursion.Solution(x, n));
//		print(10);
//		System.out.println(isSorted(arr));
//		System.out.println(sum(arr));
//		System.out.println(checkNumber(arr, no));
//		System.out.println(isSortedBetter(arr, si));
//		System.out.println(firstIndexArray(arr, x));
		System.out.println(lastIndexArray(arr, x));
		
	}

}

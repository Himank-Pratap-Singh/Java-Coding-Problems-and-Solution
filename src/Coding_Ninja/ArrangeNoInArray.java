package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNoInArray {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void arrange(int[] arr, int n) {
		// can also be done using (n-1)/2 format dividing array into two half
		
		int value = 1, start = 0, end = n-1;
		if(n%2 == 0) {
		for(int i = 1; i <= n/2; i++) {
			arr[start] = value;
			value++;
			arr[end] = value;
			value++;
			start++; 
			end--;
		}
		}
		else {
			for(int i = 1; i <= n/2 + 1 ; i++) {
				arr[start] = value;
				value++;
				if(value==n+1) return;
				arr[end] = value;
				value++;
				if(value==n+1) return;
				start++; 
				end--;
			}
		}
		
	}
	
	public static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[n];
			
			ArrangeNoInArray.arrange(arr, n);
			printArray(arr);
			t -= 1;
		}
		
		
	}

}

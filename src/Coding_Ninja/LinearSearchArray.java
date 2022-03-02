package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearchArray {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int linearSearch(int arr[], int x) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static int[] takeInput() throws IOException{
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];
		
		if(size == 0) {
			return input;
		}
		
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
		for(int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}
		
		return input;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t > 0) {
			int[] input = takeInput();
			int val = Integer.parseInt(br.readLine().trim());
			System.out.println(LinearSearchArray.linearSearch(input, val));
			
			t -= 1;
		}

	}

}

package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_RemoveConsecutiveDuplicates {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void removeDup(String str) {
		
		int len = str.length();
		char out[] =  new char[len];
		
		for(int i = 0, j = 1+1,k = 0; i < len; i++, k++) {
			if(str.charAt(i) == str.charAt(j)) {
				if(out[k] != str.charAt(i))
				out[i] = str.charAt(i);
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = br.readLine();
		
		removeDup(str);
		
	}
	
}

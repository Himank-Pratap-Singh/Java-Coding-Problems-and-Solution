package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_CheckPermutation {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static boolean CheckPermutation(String str1, String str2) {
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		char chr1[] = str1.toCharArray();
		char chr2[] = str2.toCharArray();
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		if(n1 != n2)
			return false;
		
		for(int i = 0; i < n1; i++) {
			if(chr1[i] != chr2[i])
				return false;
		}
		
		return true;
	}
	
	public static boolean CheckPermutation2(String str1, String str2) {
		int NoOfChar = 256;
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		int[] count1 = new int[NoOfChar];
		Arrays.fill(count1, 0);
		int[] count2 = new int[NoOfChar];
		Arrays.fill(count2, 0);
		
		for(int i = 0; i < str1.length() && i < str2.length(); i++){
			count1[chr1[i]]++;
			count2[chr2[i]]++;
		}
		
		if(str1.length() != str2.length())
			return false;
		
		for(int i = 0; i < NoOfChar; i++ ) {
			if(count1[i] != count2[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(CheckPermutation(str1, str2));
		System.out.println(CheckPermutation2(str1, str2));

		
	}

}

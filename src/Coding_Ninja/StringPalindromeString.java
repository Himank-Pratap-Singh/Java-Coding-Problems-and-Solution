package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringPalindromeString {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPalindrome(String str) {
		
			boolean result = true;
			int i = 0, j = str.length()-1;
			while(i < str.length() / 2) {
				if(str.charAt(i) != str.charAt(j)) {
					result = false;
					return result;
				}
				else {
					i++;
					j--;
				}
			}
		
			return result;
		}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		boolean ans = isPalindrome(str);
		System.out.println(ans);
	}
}

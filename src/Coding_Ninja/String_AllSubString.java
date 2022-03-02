package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_AllSubString {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void allSubString(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			String str1 = "";
			
			for(int j = i; j < str.length(); j++) {
				str1 = str1 + str.charAt(j);
				System.out.println(str1 );
				
			}
		
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = br.readLine();
		if(str != null) {
			str = str.trim();
		}
		else {
			str = "";
		}
		allSubString(str);
		
	}

}

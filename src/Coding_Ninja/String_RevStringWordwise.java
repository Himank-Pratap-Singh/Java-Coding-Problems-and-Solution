package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_RevStringWordwise {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void reverseStringWord(String str) {
		
		 String str1 = "";
		 String[] words = str.split("\\s");
		 
		 for(int i = words.length - 1; i >= 0; i--) {
			 str1 = str1 + words[i] + " ";
		 }
		 System.out.println(str1);
		
	}
	
	public static void main(String[] args) throws IOException {

		String str = br.readLine();
		reverseStringWord(str);
		
	}

}



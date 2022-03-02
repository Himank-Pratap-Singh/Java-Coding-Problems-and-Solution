package Coding_Ninja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CountWordsString {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int countWords(String str) {	
		//Your code goes here
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) ==  32 ) sum++;
            }
        return sum + 1;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count = countWords(str);
		System.out.println(count);
	}
}
package Coding_Ninja;

import java.util.Scanner;

public class PatternOddSq {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while(i <= n) {
        	int j = 1;
        	int b = 2 * i - 1;
        	while(j <= n) {
        		if(b <= n + n - 1) {
        			System.out.print(b);
        		}
        		else {
        			b = 1;
        			System.out.print(b);
        		}
        		b = b + 2;
        		j = j + 1;
        	}
        	System.out.println();
        	i++;
        }
	
	}
}
//(condition)?true:false;+
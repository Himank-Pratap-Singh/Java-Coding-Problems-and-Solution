package Coding_Ninja;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
	
		while(i <= n) {
			int j = 1;
			char ch = (char)('A' + n - i);
			while(j <= i ) {
//				System.out.print((char)(64 + j));
				System.out.print((char)(ch));
				j++;
				ch++;
				
			}
		
		System.out.println();
		i++;
		
		}

	}

}

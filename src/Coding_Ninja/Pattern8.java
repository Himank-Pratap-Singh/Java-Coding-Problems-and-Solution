package Coding_Ninja;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
//		char ch = 64;
		while(i <= n) {
			char p = (char)(65 + i -1);
			int j = 1;
			while(j <= n) {
				System.out.print(p);
//				System.out.print((char)(ch + j - 1));
				p++;
				j++;
			}
		System.out.println();
		i++;
//		ch = (char)(ch + 1);
		}

	}

}

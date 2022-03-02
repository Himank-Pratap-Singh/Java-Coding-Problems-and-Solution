package Coding_Ninja;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int y = n/2 + 1;
		for(int i = 1; i < y; i++) {
			
			for(int j = i; j < y; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		for(int i = 1; i <= y; i++) {
			
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < y; j++) {
				System.out.print("*");
			}
			for(int j = i; j <= y; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}

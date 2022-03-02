package Coding_Ninja;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i <= n; i++) {
			System.out.print("*");

			if(i == 0) { 
				System.out.println();
				continue;
			}

			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("*\n");
		}

		for(int i = n-1; i >= 0; i--) {

			System.out.print("*");

			if(i == 0) { 
				System.out.println();
				continue;
			}

			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("*\n");

		}

	}
}

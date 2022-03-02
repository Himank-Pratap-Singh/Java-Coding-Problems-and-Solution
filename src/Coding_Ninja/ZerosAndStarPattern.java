package Coding_Ninja;

import java.util.Scanner;

public class ZerosAndStarPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int a = n * 2 + 1;
		for(int i = 1; i <= n; i++) {

			for(int j = 1; j <= n * 2 + 1; j++) {
				if(j == i) {
					System.out.print("*");
				}
				else
					if(j == ((n * 2 + 1) / 2) + 1) {
						System.out.print("*");
					}
					else
						if(j == (n * 2 + 2) - i ) {
							System.out.print("*");
						}
						else System.out.print("0");
				
			}
			System.out.println();
		}
	}
}
//(condition)?true:false;+
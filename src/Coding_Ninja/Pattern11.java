package Coding_Ninja;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
	
		while(i <= n) {
			
			int space = 1;
			while(space <= n - i) {
				System.out.print(" ");
				space++;
			}
			
			int stars = 1;
			int p = 1;
			while(stars <= i) {
				System.out.print(p);
				stars++;
				p++;
			}
		
		System.out.println();
		i++;
		
		}

	}

}

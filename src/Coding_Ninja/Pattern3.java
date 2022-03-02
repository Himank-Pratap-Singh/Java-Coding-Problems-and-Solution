package Coding_Ninja;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			int j = 1, p = i;
			while(j <= i) {
				System.out.print(p + " ");
				p++;
				j++;
			}
		System.out.println();
		i++;
		}

	}

}

package Coding_Ninja;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int p = n;
		while(i <= n){
			int j = n;
			while(j >= i ) {
				System.out.print(p);
				j--;
			}
			System.out.println();
			i++;
			p--;
		}

	}

}

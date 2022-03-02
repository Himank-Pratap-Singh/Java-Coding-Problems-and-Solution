package Coding_Ninja;

import java.util.Scanner;

public class Pattern13 {

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

			int p = 1;
			while(p <= i) {
				System.out.print(p);
				p++;
			}

			int a = i-1;
			while(a >= 1) {
				System.out.print(a);
				a--;
			}

			System.out.println();
			i++;

		}

	}

}

package Coding_Ninja;

import java.util.Scanner;

public class Pattern14 {

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

			int j = 1;
			int p = i;
			while(j <= i ) {
				System.out.print(p);
				p++;
				j++;
			}

			int x = 1;
			int a = (2*i) - 2;
			while(x < i) {
				System.out.print(a);
				x++;
				a--;
			}

			System.out.println();
			i++;

		}

	}

}

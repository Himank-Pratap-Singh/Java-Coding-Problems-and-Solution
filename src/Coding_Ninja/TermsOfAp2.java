package Coding_Ninja;

import java.util.Scanner;

public class TermsOfAp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1;
		for(int i = 1; count <= n; i++) {
			int res = 3 * i + 2;
			if(res % 4 != 0) {
				System.out.print(res + " ");
				count++;
			}
			
		}
		
	}

}

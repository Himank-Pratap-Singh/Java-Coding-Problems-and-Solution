package Coding_Ninja;

import java.util.Scanner;

public class TermsOfAp {

	public static void ap(int i) {
		int res = 3 * i + 2;
		System.out.print(res + " ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1;
		
		int count = n;
		for(int i = 1; i <= count; i++) {
			if((3 * i + 2) % 4 == 0) {
				count ++;
			}
			else ap(i);
		}
		
	}

}

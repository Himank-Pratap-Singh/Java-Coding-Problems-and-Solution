package Coding_Ninja;

import java.util.Arrays;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no for GCD:- ");
		int n =sc.nextInt();
		int m = sc.nextInt();
		
		int res = 1;
		
		for(int i = 1; i <= n || i <= m  ; i++  ) {
			if( n % i == 0 && m % i == 0) {
				res = i;
			}
		}
		System.out.println(res);
	}

}

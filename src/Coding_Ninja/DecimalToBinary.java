package Coding_Ninja;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long pv = 1, rem, res = 0;
		
		while(n > 0) {
			rem = n % 2;
			n = n / 2; 
			
			res = res + rem * pv;
			pv = pv * 10;
		}
			
		System.out.println(res);
	}

}

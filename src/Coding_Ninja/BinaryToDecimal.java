package Coding_Ninja;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pv = 1, ans = 0, rem; 
		
		while(n > 0) {
			rem = n % 10;
			n = n / 10;
			ans = ans + (rem*pv);
			
			pv = pv * 2;
		}
			System.out.println(ans);
	}

}

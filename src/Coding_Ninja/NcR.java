package Coding_Ninja;

import java.util.Scanner;

public class NcR {

	public static int Factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int facN = Factorial(n);
		int facR = Factorial(r);
		int facNR = Factorial(n-r);
		
		int ncr = facN / (facR * facNR);
		System.out.println(ncr);
	}

}

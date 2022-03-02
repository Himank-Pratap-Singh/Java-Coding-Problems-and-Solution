package Coding_Ninja;

import java.util.Scanner;

public class AllPrimeNo {

	public void checkPrime(int i) {
		int flag = 0;
		for(int j = 2; j < i; j++) {
			if(i % j == 0) flag = 1;
		}
		if(flag == 0) System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		AllPrimeNo ac = new AllPrimeNo();
		
		for(int i = 2; i <+ n; i++) {
			ac.checkPrime(i);
			
		}

	}

}

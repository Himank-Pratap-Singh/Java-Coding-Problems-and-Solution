package Basic_Java;

import java.util.Scanner;

public class primeNo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first No ");
		int first = sc.nextInt();
		System.out.print("Enter the last no ");
		int last = sc.nextInt();
		
		System.out.print("List of prime numbers between " + first + " and " + last +"are : ");  
		
		for(int i = first; i <= last; i++) {
			if(isPrime(i)) {
				 System.out.print(i); 	
			}
		}
	}
		
	
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++ ) {
			if (n % i == 0) {
				return false;
			}
		
		}
		return true;
	}
}

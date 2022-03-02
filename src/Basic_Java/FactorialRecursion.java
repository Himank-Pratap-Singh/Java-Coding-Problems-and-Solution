package Basic_Java;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int factorial(int n) {
		if(n==0) 
			return 1;
		else 
			return (n * factorial(n-1));
	}
	
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no you want to find Factorial of:- ");
		int num = sc.nextInt();
		fact = factorial(num);
		System.out.println("Factorial of "+ num + " is "+ fact );

	}

}

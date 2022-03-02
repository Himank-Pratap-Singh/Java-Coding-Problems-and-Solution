package Coding_Ninja;

import java.util.Scanner;

public class GCD3Recursive {

	static int gcd(int num1, int num2) {
		//		if(num1 == 0 || num2 == 0)
		//			return 0;
		//		if(num1 == num2)
		//			return num1;
		//		if(num1 > num2 )
		//			return gcd(num1 - num2, num2);
		//		else
		//			return gcd(num1, num2 - num1);

		if(num1 == 0)
			return num2;
		return gcd(num2 % num1, num1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no :- ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("The GCD id :- " + gcd(num1, num2));

	}

}

package Basic_Java;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the YOu want to find Factorial off:- ");
		int n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			num = num * i;
		}
		System.out.println("The Factorial of no is: "+num);
	}

}

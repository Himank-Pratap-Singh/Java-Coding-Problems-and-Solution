package Basic_Java;

import java.util.Scanner;

public class floatingMultiple {

	public static void main(String[] args) {
		float num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Floating Values");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		float num3 = num1 * num2;
		System.out.println("multipy" + num3);
	}
	

}

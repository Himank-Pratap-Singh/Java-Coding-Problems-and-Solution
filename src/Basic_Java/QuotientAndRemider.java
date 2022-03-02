package Basic_Java;

import java.util.Scanner;

public class QuotientAndRemider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisor, dividend;
		System.out.println("Enter divisor:- ");
		divisor = sc.nextInt();
		System.out.println("Enter divident:- ");
		dividend = sc.nextInt();
		int rem = dividend % divisor;
		int quo = dividend / divisor;
		System.out.println("the rem and quo are:- " + rem + " " + quo);
	}

}

package Basic_Java;

import java.util.Scanner;

public class ReverseNo2 {

	public static int revNo(int n) {
		boolean isNoNegative = n < 0 ? true:false;
		if(isNoNegative) {
			n = n * -1;
		}
		
		int rev = 0, rem;
		while(n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		
		return isNoNegative == true ? rev * -1 : rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the no you want to reverse:- ");
		int n = sc.nextInt();
		System.out.print("The Reverse of no is:- " + revNo(n));

	}

}

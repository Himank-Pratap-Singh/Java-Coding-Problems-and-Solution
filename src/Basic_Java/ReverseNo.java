package Basic_Java;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number you want to find Reverse of:- ");
		int num = sc.nextInt();
		int temp, i, rev = 0, rem;
		temp = num;	
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		System.out.println("The reverse No is:- " + rev);

	}

}

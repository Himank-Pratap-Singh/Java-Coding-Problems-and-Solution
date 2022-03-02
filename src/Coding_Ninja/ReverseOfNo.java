package Coding_Ninja;

import java.util.Scanner;

public class ReverseOfNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int rem, res;
		int count = 0;
		if(n == 0) System.out.print("0");
		while(n > 0) {
			rem = n % 10;
			n = n / 10;
			if(rem == 0 && count == 0) {
				System.out.print("");
				
			}
			else {
				System.out.print(rem);
				count++;
			}
		}

	}

}

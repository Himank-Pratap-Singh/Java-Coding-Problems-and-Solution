package Coding_Ninja;

import java.util.Scanner;

public class GCD2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no :- ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a = num1, b = num2, res = 0;
		for(int i = 1; i <= num1 || i <= num2; i++) {
			if(a > b) {
				res = a - b;
				a = res;
			}
			else if(b > a) {
				res = b - a;
				b = res;
			}
			else if(a == b) {
				res = a;
				break;
			}
		}
			
		System.out.println("GCD is :- " + res);
	}

}

package Basic_Java;

import java.util.Scanner;

public class BinaryMultiply {
	
	public static int binaryToDecimal(int num ) {
		
		int rem, res = 0, i = 0;
		while(num > 0) {
			rem = num % 10;
			num = num / 10;
			res = res + rem * (int)Math.pow(2, i++);
			}
		return res;
		
	}
	
	public static String decimalToBinary(int num) {
		
		int rem, res, i = 0;
		String st = " ";
		while (num > 0) {
			rem = num % 2;
			num = num / 2;
			st = rem + st;
		}
		return st;
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the First Binary no:- ");
			int num1 = sc.nextInt();
			System.out.print("Enter the Second Binary no:- ");
			int num2 = sc.nextInt();
			
			int mul1 = binaryToDecimal(num1);
			int mul2 = binaryToDecimal(num2);
			
			int val = mul1 * mul2;
			
			String result = decimalToBinary(val);
			System.out.println("The mul is :- " + result);
		
		}

	}



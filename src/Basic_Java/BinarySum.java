package Basic_Java;

import java.util.Scanner;


public class BinarySum {
		public static int BinaryToDecimal(int num) {
			int rem, res = 0, i = 0;
			while(num > 0) {
				rem = num%10;
				num = num/10;
				res = res + rem*(int)Math.pow(2, i++);
			}
			return res;
		}
		
		public static String DecimalToBinary(int num) {
			int rem, i = 0;
			String out = "";
			while(num > 0) {
				rem = num % 2;
				num = num / 2;
				out = rem + out;
			}
			
			return out;
		}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the two binry No :- ");
			int num1 = sc.nextInt(); 
			int num2 = sc.nextInt();			
			int sum1 = BinaryToDecimal(num1);
			
			int sum2 = BinaryToDecimal(num2);
		
			int sum = sum1 + sum2;
			
			String res = DecimalToBinary(sum);
			
			System.out.println("the addition of two binary no are:- " + res);
			
	}
 }
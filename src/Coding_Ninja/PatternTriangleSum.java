package Coding_Ninja;

import java.util.Scanner;

public class PatternTriangleSum {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		
//		for(int i = 1; i <= n; i++) {
//			int sum = 0;
//			
//			for(int j = 1; j <= i; j++) {
//				sum = sum + j;
//				System.out.print(j + ((j == i)?"":"+"));
//			}
//			
//			System.out.print("=");
//			System.out.print(sum);
//			
//			System.out.println();
//		}
		if(n == 0) {
			System.out.println();
			return;
		}
		int sum = 1;
		String s = "1";
		for(int i = 1;i<=n;) {
			System.out.println(s + "="+sum);
			i++;
			s += "+" + i;
			sum += i;
		}
	}
}
//(condition)?true:false;+
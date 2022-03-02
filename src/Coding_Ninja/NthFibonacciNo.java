
package Coding_Ninja;

import java.util.Scanner;

public class NthFibonacciNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int fn = 0, f1 = 1, f2 = 1;
		if(n == 1 || n == 2 ) {
			System.out.println(f1);
		}
		else
			for(int i = 3; i <= n; i++) {
				fn = f1 + f2;
				f1 = f2;
				f2 = fn;
				}
//		if(n == 3) System.out.println(x);
		if(n >= 3)	System.out.println(fn);
		

	}

}

package Coding_Ninja;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.print("0");
			return;
		}
		for(int i = 1; i <= n / 2; i++) {
			int res = i * i;
			if(res == n) {
				System.out.print(i);
				break;
			}
			else
				if(res > n) {
					System.out.print(i-1);
					break;
				}
			}

	//		System.out.println((int)Math.sqrt(n));

}

}

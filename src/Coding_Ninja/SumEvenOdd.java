package Coding_Ninja;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

		//		Scanner sc = new Scanner(System.in);
		//		int n = sc.nextInt();
		//		int rem, remev = 0, remod = 0;
		//
		//		while(n > 0){
		//			rem = n % 10;
		//			n = n / 10;
		//			if(rem % 2 == 0){
		//				remev = remev + rem;
		//			}
		//			if(rem % 2 != 0){
		//				remod = remod + rem;
		//			}
		//
		//		}
		//		
		//		System.out.println(remev + " " + remod);

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();

		int res = num;

		if(power == 0) {
			System.out.println("1");
			return;
		}
		else
		{
			for(int i = 1, j = num; i < power; i++){
			res = res * j;
		}
		}
		System.out.println(res);

	}

}

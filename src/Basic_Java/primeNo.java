package Basic_Java;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		int i , n, flag = 0, m = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : " );
		n = s.nextInt();
		
		m = n/2;
		if(n==0||n==1) {
			System.out.println("Not a Prime no ");
		} else{
			for (i = 2; i <= Math.sqrt(n); i++ ) {
				if(n % i == 0) {
					System.out.println("Not a Prime No ");
					flag = 1;
					break;
				}
				}
			if(flag == 0) {
				System.out.println("Its a Prime no ");
			}
		}

	}

}

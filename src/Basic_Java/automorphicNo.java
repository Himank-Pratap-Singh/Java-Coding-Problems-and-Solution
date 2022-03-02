package Basic_Java;

import java.util.Scanner;

public class automorphicNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no:- ");
		int count = 0;
		int n = sc.nextInt();
		int sq = n * n;
		int temp = n;
		while(temp > 0) {
			count++;
			temp = temp / 10;
		}
		
		int lastDigit = (int)(sq%(Math.pow(10, count)));
		if (n == lastDigit) {
			System.out.print(n + " The no is automorphic");
		}
		else {
			System.out.println(n + " The no is not automorphic");
		}

	}

}

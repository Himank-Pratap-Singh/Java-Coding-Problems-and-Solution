package Coding_Ninja;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double bs = sc.nextDouble();
		String str = sc.next();
		char grade = str.charAt(0);
		
		double hra = .2 * bs;
		double da = .5 * bs;
		double pf = .11 * bs;
		int allow = 0;
		
		if(grade == 'A' || grade == 'a') {
			allow = 1700;
		}
		else
			if(grade == 'B' || grade == 'b') {
				allow = 1500;
			}
			else
				allow = 1300;
		
		double ts = bs + hra + da + allow - pf;
		
		System.out.println(Math.round(ts));
		
	}

}

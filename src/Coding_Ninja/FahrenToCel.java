package Coding_Ninja;

import java.util.Scanner;

public class FahrenToCel {
//	5/9 x (F-32)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sf = sc.nextInt();
		int ef = sc.nextInt();
		int gap = sc.nextInt();
		
		for(int i = sf; i <= ef; i = i + gap) {
			int c = (i-32)*5/9;
			System.out.println(i + " " + c);
		}
	}

}

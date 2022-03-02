package Coding_Ninja;

import java.util.Scanner;

public class validTriangle_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three side of Triangle:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
			if(a == b && a == c) System.out.println("Equilateral Triangle");
			else if(a == b || a ==c || b == c ) System.out.println("Isosceles Triangle");
			else System.out.println("Scalene Triangle");	
		}
		else
			System.out.println("Not a Triangle");
	}

}

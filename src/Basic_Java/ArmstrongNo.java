package Basic_Java;

import java.util.Scanner;

public class ArmstrongNo {

	 static boolean isArmstrong (int no) {
		
		int totalDigit = 0, digit, i, temp, sum=0;
		temp = no;
		while(temp>0) {
			temp = temp / 10;
			totalDigit++;
			
		}
		temp = no;
		while(temp>0) {
			digit = temp % 10;
			sum += (Math.pow(digit, totalDigit));
			temp = temp/10;
		}
		if(no == sum) 
		return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no ");
		int no = sc.nextInt();
		if(isArmstrong(no) == true) {
			System.out.println("The no is Armstrong no");
		}
		else {
			System.out.println("The no is not Armstrong no");
		}

	}

	
	}



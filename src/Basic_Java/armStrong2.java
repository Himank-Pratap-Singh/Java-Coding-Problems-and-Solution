package Basic_Java;

import java.util.Scanner;

public class armStrong2 {

	 static boolean isArmstrong (int r) {
		
		int totalDigit = 0, digit, temp, sum=0;
		temp = r;
		while(temp>0) {
			temp = temp / 10;
			totalDigit++;
			
		}
		temp = r;
		while(temp>0) {
			digit = temp % 10;
			sum += (Math.pow(digit, totalDigit));
			temp = temp/10;
		}
		if(r == sum) 
		return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Range ");
		int r = sc.nextInt();
		for(int i = 0; i <= r; i++) {
			if(isArmstrong(i) == true) {
				System.out.print(i+ ", ");  
			}
			
		}

	}

	
	}
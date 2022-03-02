package Coding_Ninja;

import java.util.Scanner;

public class ValidSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int prev = sc.nextInt();
		boolean isDec = true, isInc = true;
		
		int i= 0;
		while(i < n-1) {
			int curr =  sc.nextInt();
			if(prev == curr ) 
			{
				System.out.print("false");
				return;
			}
			else
				if(curr < prev) 
				{
					isDec = true;
					if(isDec == false) {
						isDec = false;
					}
				}
				else
					if(curr > prev) 
					{
						if(isDec == true) {
							isDec = false;
						}
					}
			
			prev = curr;
			i++;
		}
		
		System.out.println(isDec);

	}

}

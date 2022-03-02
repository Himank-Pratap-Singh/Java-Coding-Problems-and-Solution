package Coding_Ninja;

import java.util.Scanner;

public class FahrenToCelFunc {

	public static boolean checkMember(int num){

        int f1 = 0;
        int f2 = 1;
        int fn = 0;
		
        if(num == 0 || num == 1) return true;
        
        for(int i = 0; i <= num + 1; i++){
            fn = f2 + f1;
            f1 = f2;
            f2 = fn;
            if(fn == num) break;
           	
        }
		  if(fn == num) return true;
          else return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkMember(num));
	}

}

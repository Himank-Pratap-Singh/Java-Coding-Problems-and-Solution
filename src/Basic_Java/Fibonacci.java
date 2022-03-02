///**
// * 
// */
//package Basic_Java;
//
//import java.util.Scanner;
//
//public class Fibonacci {
//
//	
//	public static void main(String[] args) {
//		long n1 = 0, n2 = 1, n3 = 0;
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int count = sc.nextInt();
//		if (count == 1) {
//			System.out.println("1");
//		}
//		else
//		{
//		for(int i = 2; i <= count; ++i)
//		{
//			n3 = n1 + n2 ;
//			n1  = n2;
//			n2 = n3;	
//		}
//		System.out.print( n3 );
//		}
//	}
//
//}

//public class Solution{
//    public static int fibonacciNumber(int n){
//		int n1 = 0, n2 = 1, n3 = 0;
//		if (n == 1) {
//			return 1;
//		}
//		else
//		{
//		for(int i = 2; i <= n; ++i)
//		{
//			n3 = n1 + n2 ;
//			n1  = n2;
//			n2 = n3;	
//		}
//		}
//        return n3;
//	}
//}

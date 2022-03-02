package Basic_Java;
//Add element of two arrays :-
import java.util.Scanner;

public class Array1 {
	
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int res, res1 = 0, res2 = 0;
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			res1 = res1 + arr1[i];
		}
		for(int i = 0; i < m; i++) {
			res2 = res2 + arr2[i];
		}
		
		res = res1 + res2;
		System.out.println(res);
		
	
	}
	
}

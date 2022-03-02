// copy all element of array to another
package Basic_Java;

import java.util.Scanner;

public class Array6 {

	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int[] val = new int[n];

	    int  visi = -1;
	    
	    for(int i = 0 ; i < n ; i++) {
	        arr[i] = sc.nextInt();
	        }
	    
	    for(int i = 0; i < n; i++) {
	    	int count = 1;
	    	for(int j = i + 1; j < n; j++) {
	    		if(arr[i] == arr[j]) {
	    			count++;
	    			val[j] = visi;
	    		}
	    	}
	    	
	    	if(val[i] != visi)
	    	val[i] = count;
	    	
	    }
	    
	    for(int i = 0; i < n; i++){  
            if(val[i] != visi)  
                System.out.println("    " + arr[i] + "    |    " + val[i]);  
        } 
	}
}

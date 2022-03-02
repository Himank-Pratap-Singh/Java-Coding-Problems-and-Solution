package CompaniesCodingProb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeTimeAgain {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int countPrimeGroup(int dayHours, int parts) {
		int x = dayHours / parts ; //12
		int count = 0, num = 1;

		int[][] arr = new int[parts][x];

		for(int i = 0; i < parts; i++) {

			for(int j = 0; j < x; j++) {
				arr[i][j] = num;
				num++;

			}
		}

		for(int i = 0; i < x; i++) {
			int flag = 0;
			for(int j = 0; j < parts; j++) {

				if(arr[j][i] == 1 ) 
					flag = 1;
				else {
					for(int k = 2; k <= Math.sqrt(arr[j][i]); k++) {
						if(arr[j][i] % k == 0) {
							flag = 1;
							break;
						}
					}
				}
				
			}
			if(flag == 0) 
				count++;
		}
				return count;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(br.readLine().trim());
		while(t > 0) {
			//	int dayHours, parts = Integer.parseInt(br.readLine().trim().split("\\s"));
			//	int parts = Integer.parseInt(br.readLine().trim());
			int dayHours = sc.nextInt();
			int parts = sc.nextInt();
			System.out.println(countPrimeGroup(dayHours, parts));
//						countPrimeGroup(dayHours, parts);

			t -= 1;
		}

	}

}

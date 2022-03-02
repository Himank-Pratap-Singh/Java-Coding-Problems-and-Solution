package Basic_Java;

public class linearSearch2 {
	
	public static void search(int arr[], int item) {
		int position = -1;
		int lenght = arr.length;
		int first = 0;
		int last = lenght-1;
		for(int i = 0; i < lenght; i++) {
			
			if(arr[first] == item) {
				position = first;
				System.out.print("Element found in array at " + (position + 1) + " position with "
						+ (first + 1) + " attempt. ");
				break;
			}
			
			if(arr[last] == item) {
				position = last;
				System.out.print("Element found in array at " + (position + 1) + " position with "
						+ (lenght-last) + " attempt. ");
				break;
			}
			first++;
			last--;
			
		}
		
		if(position == -1) {
			System.out.println("Element not present in the list.");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int item = 5;
		
		search(arr, item);
	}
}

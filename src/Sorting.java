
import java.util.Arrays;

public class Sorting {
	public static void Sort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main2(String args[]) {
		int[] num = { 3, 2, 5, 4, 6, 9, 8 };
		System.out.println("Before sorting:");
		for (int j : num) {
			System.out.println(j);
		}
		
		Sort(num);
		System.out.println("after sorting:");
		for (int j : num) {
			System.out.println(j);
		}
	}
}


//Shortcuts
//shift+ctrl+f - Auto formatting
//shortcut - sysout+space



package assignments.day2;

import java.util.Arrays;

public class SecondSmallest_Array {

	public static void main(String[] args) {
		
		int [] arr = {23,45,67,32,89,22};
		
		Arrays.sort(arr); // 22,23,32,45,67,89
		
		int x = arr.length-5;
		
		System.out.println("The second smallest number in the given Array is "+ arr[x]);
		
		

	}

}

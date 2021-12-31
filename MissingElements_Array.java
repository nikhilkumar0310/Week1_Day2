package assignments.day2;

public class MissingElements_Array {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,5,4,6,8};
		int sum = 0;
		
		int expectedNoElemnets = arr.length+1;
		int sumOfTotalElements = (expectedNoElemnets * (expectedNoElemnets+1))/2; //**generic formula for getting the sum of all elements in an Array including the missing one
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("The missing number in the given array is "+ (sumOfTotalElements-sum));

	}

}

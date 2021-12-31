package assignments.day2;

public class Negative_To_Positive {

	public static void main(String[] args) {
		
		int number = -40;
		int positiveNum=0;
		if (number>0) {
			System.out.println(number+ " is a Positive Number");
		}
		else if(number<0) {
			positiveNum = -1*number;
			System.out.println(positiveNum +" the Negative Number is converted to Positive");
		}
		else {
			System.out.println("The number entered is invalid or Zero");
		}

	}

}

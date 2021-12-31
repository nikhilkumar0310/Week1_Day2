package assignments.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 127, rev=0, rem=0;
		int temp = number;
		
		while(temp!=0) {
		rem = temp%10;
		rev = rev * 10 + rem;
		temp = temp/10;
		}
		
		if (rev==number) {
			System.out.println(number+" its a Palindrome Number");
		}
		else {
			System.out.println("This is not Palindrome");
		}

	}

}

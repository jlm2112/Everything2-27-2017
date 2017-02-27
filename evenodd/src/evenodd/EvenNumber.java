package evenodd;

//even true else odd
public class EvenNumber {

	public static void main(String[] args) {
		int input = 701;
		boolean output = input % 2 == 0;
		System.out.println(output);

	}

}

import java.util.Scanner;

class EvenVerify {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of which you would like to confirm parity.");
		int testValue = scanner.nextInt();
		
		if (testValue % 2 ==0) {
			System.out.println("Your number " + testValue + " is even.");

		}
		
		else {
			System.out.println("Your number " + testValue + " is odd.");

		}
	}

	//print all odd numbers to 99 
	public class OddNum {

		public static void main(String[] args) {
			
		int i =1;
			for ( i = 1; i < 100; i+=2) {
			    System.out.println(i);
			}
			
		}
		
	}
}

// sdf array compare 

public static void main(String[] args) {

	int end = 10;
	int start = 1;

	for (int first = start; first < end; first++) {
		if (first % 2 == 0)
			System.out.println("True " + first + " " + " is an even number.");
		else
			System.out.println("False " + first + " " + " is not an even number.");
	}

}
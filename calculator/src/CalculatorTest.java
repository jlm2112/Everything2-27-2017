import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		boolean useCalculator;
		Scanner scanner = new Scanner(System.in);
		
	
		do {
		System.out.println("Enter first value: ");
		float firstValue = scanner.nextFloat();
		System.out.println("Enter second value: ");
		float secondValue = scanner.nextFloat();

		System.out.println("Please choose an operation: + - * /");
		String operator = scanner.next();

		switch (operator) {

		case "+":
			float sum = calculator.sum(firstValue, secondValue);
			System.out.println(firstValue + " + " + secondValue + " = " + sum);
			break;

		case "-":
			float difference = calculator.difference(firstValue, secondValue);
			System.out.println(firstValue + " - " + secondValue + " = " + difference);
			break;
			
		case "*":
			float product = calculator.product(firstValue, secondValue);
			System.out.println(firstValue + " * " + secondValue + " = " + product);
			break;
			
		case "/":
			float divide = calculator.divide(firstValue, secondValue);
			System.out.println(firstValue + " / " + secondValue + " = " + divide);
			break;

		default:
			// dunno what to do
		}

		//if (operator.equals("+")) {

		//	float sum = calculator.sum(firstValue, secondValue);
		//	System.out.println(firstValue + " + " + secondValue + " = " + sum);

		//} else if (operator.equals("-")) {

		//	float difference = calculator.difference(firstValue, secondValue);
		//	System.out.println(firstValue + " - " + secondValue + " = " + difference);

		//} else {
			// dunno what to do
		//}
		System.out.println("Continue? yes or no");
        String response = scanner.next();
        useCalculator = response.equals("yes");

		
		
		} while (useCalculator);
		System.out.println("Goodbye");
		scanner.close(); 
	}
}
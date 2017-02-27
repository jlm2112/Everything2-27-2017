import java.util.Scanner;

public class GpaCalculatorTest {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("WELCOME TO THE GPA CALCULATOR APP \n\n");
		System.out.println("How many classes do you have?\t");
		int index = userInput.nextInt();
		double point = 0.0d; 
		double totalPoints = 0.0d;
		char grade = ' ';
		double [] scores = new double[index];
		
		for (int i = 0; i < scores.length; i++) {
			
			System.out.println("Please enter your scores percentage "
					+ "(Between 0 - 100):\t");
			
			Scanner userInput2 = new Scanner(System.in);
			scores[i] = userInput2.nextDouble();
			
		}
		for (double score: scores) {
			
			if (score > 80) {
				grade = 'A';
				point = 4;
				totalPoints += point;
			}else if (score <= 80 && score > 60) {
				grade = 'B';
				point = 3;
				totalPoints += point;
			}else if (score <= 60 && score > 40) {
				grade = 'C';
				point = 2;
				totalPoints += point;
			}else if (score <= 40 && score > 20) {
				grade = 'D';
				point = 1;
				totalPoints += point;
			}else if (score <= 20) {
				grade = 'F';
				point = 0;
				totalPoints += point;
			}
				
				
				
				
			System.out.println("Your Score " + score +
					" was graded to " + grade + " with a GPA point of " + point + "\n");
			
			
		}
		
		System.out.println("\nYour Average GPA is \t" + (totalPoints/index));
		System.out.println("\n\nThank You and GoodBye..!!");
		userInput.close();
		System.exit(0);
		

	}

} 

//second
import java.util.Scanner;
public class GpaCalculatorTest {

	public static void main(String[] args) {			
		Scanner scanner = new Scanner(System.in);	
		float[] gpaScale = { 4.0f, 3.5f, 3.0f, 2.5f, 2.0f };
		String[] grades;
		float gpa = 0;
		int index;
		
		System.out.println("How many classes have you taken?");
		index = scanner.nextInt();
		grades  = new String[index];
		
		System.out.println("What were the grades for each class?");
		for(int i = 0; i < index; i++) {
			grades[i] = scanner.next();
			if(grades[i].equals("A")) {
				gpa += gpaScale[0];
			} else if(grades[i].equals("B")) {
				gpa += gpaScale[1];
			} else if(grades[i].equals("C")) {
				gpa += gpaScale[2];
			} else if(grades[i].equals("D")) {
				gpa += gpaScale[3];
			} else if(grades[i].equals("F")) {
				gpa += gpaScale[4];
			}
		}
		
		float gpaAvg = gpa/index;		
		System.out.println("Your GPA is: " + gpaAvg);
		
		scanner.close();
		
	}

}
import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		boolean exit = false;
		Scanner input = new Scanner(System.in);
		
		BigDecimal checkingBalance = new BigDecimal("100");
		BigDecimal savingsBalance = new BigDecimal("500");
		BigDecimal creditCardBalance = new BigDecimal("0");
		
		Account myChecking = new CheckingAccount(checkingBalance);
		Account myCreditCard = new CreditCard(creditCardBalance);
		Account mySavings = new SavingsAccount(savingsBalance);
		
		//do {
			//view balance for any account 
			System.out.println("Welcome to the bank");
			System.out.println("Which account would you like to check the balance in?"
					+ "For Checking enter 'C' /n"
					+ "For Savings enter 'S' /n"
					+ "For Credit Card enter 'CC'.");
			Scanner ourInput = new Scanner(System.in);
			String response = input.next();
			switch (response) {
			case "C": 
					checkingAccount.getAccountBalance();
					System.out.println("Your Checking balance is $" + checkingBalance);
			case "S";

	}
}
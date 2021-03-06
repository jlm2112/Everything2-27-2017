import java.math.BigDecimal;

public abstract class Account {

	private String clientName;
	private String accountNumber;
	protected BigDecimal balance;
	protected BigDecimal interestRate;

	public Account(BigDecimal startingBalance, BigDecimal startingIntRate) {
		balance = startingBalance;
		interestRate = startingIntRate;

	}

	// this abstract method indicates that all subclasses must implement this method
	public abstract String getAccountType();

	public void update() {
		BigDecimal interest = balance.multiply(interestRate);
		balance = balance.add(interest);

		// fix the rounding
		balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
	}

	public void withdraw(BigDecimal amountToWithdraw) {
		balance = balance.subtract(amountToWithdraw);
	}
}

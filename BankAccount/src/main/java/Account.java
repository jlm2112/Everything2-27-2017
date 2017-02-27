import java.math.BigDecimal;

public abstract class Account {

	private String clientName;
	private String accountNumber;
	protected BigDecimal accountBalance;
	protected BigDecimal interestRate;

	public Account(BigDecimal balance) {
		accountBalance = balance;

	}

	public abstract void update();

	{

	}

	public abstract String getAccountType();

	{

	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	
	public String getClientName() {
		return clientName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

}
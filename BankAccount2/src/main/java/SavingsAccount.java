import java.math.BigDecimal;

public class SavingsAccount extends Account {

	public SavingsAccount(BigDecimal startingBalance, BigDecimal startingIntRate) {
		super(startingBalance, startingIntRate);
		interestRate = new BigDecimal("0.04");
	}

	@Override
	public String getAccountType() {
		return "Savings";
	}

 

}

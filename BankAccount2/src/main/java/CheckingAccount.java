import java.math.BigDecimal;

public class CheckingAccount extends Account {

	public CheckingAccount(BigDecimal startingBalance, BigDecimal startingIntRate) {
		super(startingBalance, startingIntRate);
		interestRate = new BigDecimal("0.02");
	}

	@Override
	public String getAccountType() {
		return "Checking";

	}

 
}

import java.math.BigDecimal;

public class CreditCard extends Account{

	public CreditCard(BigDecimal startingBalance, BigDecimal startingIntRate) {
		super(startingBalance, startingIntRate);
		interestRate = new BigDecimal("0.18");
	}

	@Override
	public String getAccountType() {
		return "Credit Card";
	}

 
}

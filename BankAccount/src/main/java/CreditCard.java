import java.math.BigDecimal;

public class CreditCard extends Account {

	public CreditCard(BigDecimal balance) {
		super(balance);
		interestRate = new BigDecimal(0.15);
 	}

	public void update() {
		
	}
	public String getAccountType() {
		return "Credit Card Account";
		
	}
 
}

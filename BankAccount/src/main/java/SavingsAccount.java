import java.math.BigDecimal;

public class SavingsAccount extends Account {

	public SavingsAccount(BigDecimal balance) {
		super(balance);
		interestRate = new BigDecimal(0.05);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update() {
	}

	@Override
	public String getAccountType() {
	
		 
		return "Savings Account";
		
	}
 
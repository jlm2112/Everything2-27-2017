import java.math.BigDecimal;

public class CheckingAccount extends Account {

	public CheckingAccount(BigDecimal balance) {
		super(balance);
		
		}

	@Override
	public void update() {
	}

	@Override
	public String getAccountType() {
		return "Checking Card Account";
		
	}
 

}
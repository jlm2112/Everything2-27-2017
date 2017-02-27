import org.junit.Assert;
import org.junit.Test;

public class FortuneTellerTest {

	@Test
	public void shouldJoinFirstAndLastToCreateFullName() {
		FortuneTeller underTest = new FortuneTeller("Robert", "Martin", "not relevant to test");// arrange
		String result = underTest.buildFullName();// act
		Assert.assertEquals("Robert Martin", result);// assert
	}

	@Test
	public void shouldGiveIncomeOf100MForFirstLetter() {
		FortuneTeller underTest = new FortuneTeller("Martin", "Fowler", "August");// arrange
		String result = underTest.determineIncome();// act
		Assert.assertEquals("$100,000,000", result);
	}
	
	@Test
	public void shouldGiveIncomeOf42ForSecondLetter() {
		FortuneTeller underTest = new FortuneTeller("Michael", "Feathers", "January");// arrange
		String result = underTest.determineIncome();// act
		Assert.assertEquals("$42", result);
	}
	
	@Test
	public void shouldGiveIncomeOf1MForThirdLetter() {
	}
	
	@Test
	public void shouldGiveIncomeOf1546234MForDefault() {
	}
	
	@Test
	public void shouldBuildFortune() {
		FortuneTeller underTest = new FortuneTeller("Michael", "Feathers", "January");// arrange
		String result = underTest.buildFortune();// act
		Assert.assertEquals("Michael Feathers will retire with an income of $42/year", result);
	}
}

import org.junit.Assert;
import org.junit.Test;

public class AgeDistributionTest {

	@Test
	public void shouldBeInElementarySchool() {
		AgeDistribution underTest = new AgeDistribution();// arrange
		String result = underTest.ClassifyAge(7);// act
		Assert.assertEquals("Elementary School", result); // assert
	}

	@Test
	public void shouldBeInMiddleSchool() {
		AgeDistribution underTest = new AgeDistribution();// arrange
		String result = underTest.ClassifyAge(14);// act
		Assert.assertEquals("Middle School", result); // assert
	}
}

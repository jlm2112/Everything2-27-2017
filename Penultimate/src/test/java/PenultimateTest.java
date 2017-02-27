import org.junit.Assert;
import org.junit.Test;

public class PenultimateTest {

	@Test
	public void returnPenultimateWord() {
		Penultimate underTest = new Penultimate();// arrange
		String result = underTest.Penultimate("We are amazing people");// act
		Assert.assertEquals("amazing", result);// assert
		
		underTest.
	}

	@Test
	public void returnPenultimate2() {
		Penultimate underTest = new Penultimate();// arrange
		String result = underTest.Penultimate("happy days at school");// act
		Assert.assertEquals("at", result);// assert
	}

	@Test
	public void returnPenultimate3() {
		Penultimate underTest = new Penultimate();// arrange
		String result = underTest.Penultimate("confused as to how we are going to fix this");// act
		Assert.assertEquals("fix", result);// assert
	}
}
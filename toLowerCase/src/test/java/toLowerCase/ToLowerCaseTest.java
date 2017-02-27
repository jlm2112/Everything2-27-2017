package toLowerCase;

import org.junit.Assert;
import org.junit.Test;

public class ToLowerCaseTest {

	@Test
	public void shouldReturnLowerCase() {
		ToLowerCase underTest = new ToLowerCase(); // arrange
		String result = underTest.ToLowerCase("UPPER CASE STUFF"); // act
		Assert.assertEquals("upper case stuff", result);
	}

	@Test
	public void shouldReturnLowerCase2() {
		ToLowerCase underTest = new ToLowerCase(); // arrange
		String result = underTest.ToLowerCase("StUfF"); // act
		Assert.assertEquals("stuff", result);
	}
}
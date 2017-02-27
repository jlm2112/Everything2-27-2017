import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		FizzBuzz underTest = new FizzBuzz(); // arrange constructor instantiates
		String response = underTest.say(1);// act
		Assert.assertEquals("1", response); // assert
	}

	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(2); // act
		Assert.assertEquals("2", response); // assert
	}

	@Test
	public void shouldSayFizzforThree() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(3); // act
		Assert.assertEquals("Fizz", response); // assert
	}

	@Test
	public void shouldSayBuzzforFive() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(5); // act
		Assert.assertEquals("Buzz", response);
	}

	@Test
	public void shouldSayFizzforSix() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(6); // act
		Assert.assertEquals("Fizz", response); // assert
	}

	@Test
	public void shouldSayBuzzforTen() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(10); // act
		Assert.assertEquals("Buzz", response); // assert

	}

	@Test
	public void shouldSayFizzBuzzforFifteen() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(15); // act
		Assert.assertEquals("FizzBuzz", response);
	}

	@Test
	public void shouldSayFizzBuzzforThirty() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(30); // act
		Assert.assertEquals("FizzBuzz", response);
	}
}

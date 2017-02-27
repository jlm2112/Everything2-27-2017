import org.junit.Assert;
import org.junit.Test;

public class WordToDigitsTest {


@Test
public void returnWordsToDigits() {
    WordToDigits underTest = new WordToDigits();//arrange
    String result = underTest.WordToDigits("eight;nine;seven");//act
    Assert.assertEquals("897", result); //assert

    }
@Test
public void returnWordsToDigits1() {
    WordToDigits underTest = new WordToDigits();//arrange
    String result = underTest.WordToDigits("one;two;four;seven;nine;two");//act
    Assert.assertEquals("124792", result); //assert
    }
}
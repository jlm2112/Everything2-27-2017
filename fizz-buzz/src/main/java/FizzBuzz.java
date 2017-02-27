
public class FizzBuzz {

	public String say(int i) {

		boolean isFizz = i % 3 == 0;
		if (isFizz && isBu zz(i)) {
			return "FizzBuzz";
		}
		{
			if (isFizz) {
				return "Fizz";
			}
			if (isBuzz(i)) {
				return "Buzz";
			}

			return "" + i;
		}

	}

	private boolean isBuzz(int i) {
		return i % 5 == 0;
	}
}

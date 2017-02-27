
public class FizzBuzzApp {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		for(int count = 1; count <= 100; count++){
			String response = fizzBuzz.say(count);
			System.out.println(response);
		}
	}

}

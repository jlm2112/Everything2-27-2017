package dog;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog shortDog = new Dog("Short Dog", 14); // = assignment operator new = operator Dog() Assigmnet operator
		shortDog.bark();
		String response = shortDog.speak();
		System.out.println("Short Dog says '" + response + "'. ");
		int humanAge = shortDog.equivalentHumanAge();
		System.out.println("If I were a humnan, I'd be " + humanAge + ". ");
		
	}

}

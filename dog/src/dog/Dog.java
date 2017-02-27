package dog;

public class Dog {
	private String name; //instance attribute 
	private int age;
	public final static String FAMILY = "Canine"; //class attribute
	
	// constructors create objects (instances of classes) 
	// name same as class name does not return value 
	public Dog(String name, int age) { // local variable 
		this.name = name; 
		this.age = age;
	}
	
	//'void' methods don't return a value 
	// the grammar of the language requires you to specify a return value
	public void bark() {
		//woof is a string literal 
		System.out.println("woof");
	}
	
	//this method returns a String literal
	public String speak() {
		// + is the string concatenation operator 
		return "My name is " + name; 
	}
	public int equivalentHumanAge() {
		//7 is what we call a "magic number". that's bad. 
		//we'd usually create a constant 
		return 7*age;
	}
}

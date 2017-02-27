public class Penultimate {

	public String Penultimate(String input) {
		String[] words= input.split("\\s");
		return words[words.length-2];
	}

}
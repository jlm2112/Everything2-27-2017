
public class WordToDigits {
    public String WordToDigits(String input) {
        String[] funTimeArray = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] inputArray = input.split(";");
        String output = "";

        for (int inputIndex = 0; inputIndex < inputArray.length; inputIndex++) {
            for (int funTimeIndex = 0; funTimeIndex <= 9; funTimeIndex++) {
                if (inputArray[inputIndex].equals(funTimeArray[funTimeIndex])) {
                    output += funTimeIndex;
                    
                }

            }

        }
        return output;

    }
}
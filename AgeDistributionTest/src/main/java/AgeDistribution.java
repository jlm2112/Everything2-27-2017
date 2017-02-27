
public class AgeDistribution {

	public String ClassifyAge(int i) {
		String output = null;
		if (i>= 0 && i <= 2) {
			output = "Stil in Mama's arms";
		} else if (i >= 3 && i <= 4) {
			output = "Preschool Maniac";
		} else if (i >= 5 && i <= 11) {
			output = "Elementary School";
		} else if (i >= 12 && i <= 14) {
			output = "Middle School";
		} else if (i >= 15 && i <= 18) {
			output = "High School";
		} else if (i >= 19 && i <= 22) {
			output = "College";
		} else if (i >= 23 && i <= 65) {
			output = "Working for the man";
		} else if (i >= 66 && i <= 100) {
			output = "The golden years";
		}

		return output;
	}

}

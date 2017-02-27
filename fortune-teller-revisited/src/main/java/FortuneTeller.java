public class FortuneTeller {

	private String firstName;
	private String lastName;
	private String birthMonth;

	public FortuneTeller(String firstName, String lastName, String birthMonth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
	}

	public String buildFullName() {
		return firstName + " " + lastName;
	}

	public String determineIncome() {
		if (fullNameLowerCase().contains(firstLetterOfMonth())) {
			return "$100,000,000";
		}
		return "$42";
	}

	private String firstLetterOfMonth() {
		return birthMonth.substring(0, 1).toLowerCase();
	}

	private String fullNameLowerCase() {
		return buildFullName().toLowerCase();
	}

	public String buildFortune() {
		String fullName = buildFullName();
		String income = determineIncome();
//		return fullName + " will retire with an income of " + income + "/year";
		return String.format("%s will retire with an income of %s/year", fullName, income);
	}

}
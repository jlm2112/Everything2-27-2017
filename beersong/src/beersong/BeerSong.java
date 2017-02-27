package beersong;

public class BeerSong {
	public static void main(String[] args) {
		int numberOfBottles = 100;
		singStanza(numberOfBottles);

		singStanza(numberOfBottles);
		/**
		 * These expressions are equivalent
		 * numberOfBottles = numberOfBottles - 1;
		 * numberOfBottles -= 1;
		 * numberofBottles--;
		 */
		while (numberOfBottles >= 67) {
			numberOfBottles = numberOfBottles - 1;
			singStanza(numberOfBottles);
		}
			do {
			numberOfBottles -= 1;
			singStanza(numberOfBottles);
			
		} while (numberOfBottles >50);
		
		for(int bottleCount = 49; bottleCount > 0; bottleCount--) {
			singStanza(bottleCount);
		}
		System.out.println("No more bottles of refreshing beverage on the waaaaall!");
	}
/**
 * we could also do it this way:
 * String descriptor = numberOfBottles >? "bottles": bottle";
 * 
 * this is called a terary operator. You'll like it later
 */
	private static void singStanza(int numberOfBottles) {
		
		String descriptor;
		boolean onlyOneBottle = (numberOfBottles == 1);
		if(onlyOneBottle) {
			descriptor = "bottle";
		} else {
			descriptor = "bottles";
		}
		
		String bottlesLyric = numberOfBottles +" " + descriptor + " of refreshing beverage";
		System.out.println(bottlesLyric + " on the wall. " + numberOfBottles + " " + descriptor + " of refreshing beverage. ");
		System.out.println("Take one down, pass it around, ");
	}

}

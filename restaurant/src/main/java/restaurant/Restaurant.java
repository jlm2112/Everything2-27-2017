package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {

	public static void main(String[] args) {
		Map<String, BigDecimal> menu = new HashMap<String, BigDecimal>();
		BigDecimal price = new BigDecimal("8.97");
		menu.put("Spaghetti", price);
		price = new BigDecimal("10.98");
		menu.put("Lasagna", price);
		menu.put("Pizza", new BigDecimal("15.50")); // method call in place of
													// variable
		menu.put("Kale Salad", new BigDecimal("7.00"));
		menu.put("Caesar Salad", new BigDecimal("7.00"));

		price = menu.get("Spaghetti");
		System.out.println("Spaghetti price = " + price);

		int entries = menu.size();
		System.out.println("Number of menu items = " + entries);

		menu.put("Bottle of Champagne", new BigDecimal("200.00"));
		menu.put("Bottle of Vintage Wine", new BigDecimal("175.00"));

		boolean findChampagne = menu.containsKey("Bottle of Champagne");
		if (findChampagne) {

			System.out.println("Yes we have champagne");

		}
		boolean findPrice = menu.containsValue("13.50");
		if (findPrice) {
			System.out.println("Yes, $13.50 is a price on the menu.");
		} else {
			System.out.println("No, $13.50 is not a price on the menu.");

		}

		menu.remove("Kale Salad");
		entries = menu.size();
		System.out.println("Number of menu items = " + entries);
		
		//menu.clear();
		entries = menu.size();
		System.out.println("Number of menu items = " + entries);
		System.out.println("Is the menu empty?: " + 
		menu.isEmpty());
		
		System.out.println(menu.keySet());
		System.out.println(menu.entrySet());
		System.out.println(menu.values());

	}
	
}

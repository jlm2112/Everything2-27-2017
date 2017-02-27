package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Menu {

	private Map<String, BigDecimal> newMenu = new HashMap<String, BigDecimal>();

	public void addItem(String name, String price) {
		newMenu.put(name, new BigDecimal(price));
	}

	public void removeItem(String name) {
		newMenu.remove(name);

	}

	public void print() {
		System.out.println(newMenu.entrySet());

	}
}

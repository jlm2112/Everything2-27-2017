package restaurant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MenuApp {

	public static void main(String[] args){
		
		Menu newMenu = new Menu();
 		newMenu.addItem("Kale", "7.00");
 		newMenu.addItem("Spaghetti", "8.97");
 		newMenu.addItem("Lasagna", "10.98");
 		newMenu.addItem("Pizza", "15.50");
 		newMenu.addItem("Caesar Salad", "7.00");
 		newMenu.removeItem("Caesar Salad");



 		

		newMenu.print();
		
	}
}

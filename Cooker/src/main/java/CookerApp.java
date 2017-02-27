
public class CookerApp {

	public static void main (String[] args) {
		Cooker myCooker = new Cooker();
		myCooker.cook();
		Cooker myGrill = new Grill();
		myGrill.cook();
		Cooker myPizzaOven = new PizzaOven();
		myPizzaOven.cook();
		
		System.out.println("*****************************");
		System.out.println("Let the manager handle the cooking!");
		KitchenManager manager = new KitchenManager();
		
		Cooker kmPizzaOven = new PizzaOven(); //declare one as general type
		
		Grill kmGrill = new Grill(); //declare one as specific type
		
		manager.handleCooking(kmPizzaOven);
		manager.handleCooking(kmGrill);
	}
}

package mapsyay;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapsYay {

	public static void main (String[] args) {
		Map<String, String> studentIds = new HashMap<String, String>(); //key type, value type

		studentIds.put("123456789", "John Smith");
		String studentName = studentIds.get("123456789");
		boolean ssnRegistered = studentIds.containsKey("123456789");
		boolean nameRegistered = studentIds.containsValue("John Smith");
		studentIds.remove("123456789");
		// shift control T - open by type name 
		int numberOfEntries = studentIds.size();
		boolean empty = studentIds.isEmpty();
		studentIds.clear(); 
		
		String price = "7.95"; //how you do it with string
		BigDecimal price = new BigDecimal("7.95");  //how you do it with big decimal
		Map<String, String> prices = 
		Map<String, BigDecimal> prices = 
		
	}
	
	
}

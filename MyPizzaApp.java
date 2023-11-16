
public class MyPizzaApp {

	public static void main (String[] args) {
		
		if (args.length != 2) {
			
			System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
			System.exit(1);
			
		}
		
		
		String f = args[0];
		String pK = args[1];
		
		PizzaStore pizzaStore;
		
		if (f.equals("NYPizzaStore")) {
			
			pizzaStore = new NYPizzaStore();
			
		} 
		
		else if (f.equals("ChicagoPizzaStore")) {
			
			pizzaStore = new ChicagoPizzaStore();
			
		} 
		
		else {
			
			System.out.println("The Franchise entered does not exist");
			return;
			
		}
		
		pizzaStore.orderPizza(pK);
		
	}
	
}

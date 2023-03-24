package PizzaBillGenerator;

public class PizzaDriver {
	public static void main(String[] args) {
		Pizza basePizza=new Pizza(true);
		//basePizza.addExtraCheese();
		//basePizza.addExtratopings();
		//basePizza.takeAway();
	      basePizza.getBill();
		
		
		DeluxPizza dp=new DeluxPizza(false);
		dp.takeAway();
		dp.getBill();
	}

}

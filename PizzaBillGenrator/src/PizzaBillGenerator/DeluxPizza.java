package PizzaBillGenerator;

public class DeluxPizza extends Pizza {
	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtratopings();
	}

	@Override
	public void addExtraCheese() {
	}

	@Override
	public void addExtratopings() {

	}
	
	

}

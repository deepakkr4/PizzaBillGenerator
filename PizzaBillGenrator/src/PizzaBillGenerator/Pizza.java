package PizzaBillGenerator;

public class Pizza {
	private int price;
	private Boolean veg;
	
	private int extraCheesePrice=100;
	private int extraTopingsPrice=150;
	private int backPackPrice=20;
	
	private int basePizzaPrice;
	private Boolean isExtraCheeseAdded=false;
	private Boolean isExtraTopingsAdded=false;
	private Boolean isOptedTakeAway=false;
	
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		this.price +=extraCheesePrice;
	}
	public void addExtratopings() {
		isExtraTopingsAdded=true;
		this.price+=extraTopingsPrice;
	}
	public void takeAway() {
		isOptedTakeAway=true;
		this.price+=backPackPrice;
	}
	public void getBill() {
		String bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill+="Extra cheese added: "+extraCheesePrice+ "\n";
		}
		if(isExtraTopingsAdded) {
			bill+="Extra Topings added: "+extraTopingsPrice+ "\n";
		}
		if(isOptedTakeAway) {
			bill+="Take Away: "+backPackPrice+ "\n";
		}
		bill+="Bill: "+this.price+"\n";
		System.out.println(bill);
		
	}

}

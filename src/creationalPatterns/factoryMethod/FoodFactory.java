package creationalPatterns.factoryMethod;

class FoodFactory {
	String food_req;

	public FoodFactory(String food_req) {
		super();
		this.food_req = food_req;
	}
	
	public void prepareFood() {
		
		if(this.food_req.equals("meal")) {
			System.out.println("Requested is meal");
			
			Meal m = new Meal();
			m.prepare();
		}
		
		if(this.food_req.equals("roti")) {
			System.out.println("Requested is roti");
			
			Roti r = new Roti();
			r.prepare();
		}
	}
}

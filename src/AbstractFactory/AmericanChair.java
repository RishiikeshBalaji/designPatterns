package AbstractFactory;

public class AmericanChair implements Chair {
	
	public AmericanChair(){
		System.out.println("American Chair");
	}
	
	public void chairMake() {
		System.out.println("American make chair");
	}
	
	public void chairMaxWeight() {
		System.out.println("Max weight in american chair");
	}
}

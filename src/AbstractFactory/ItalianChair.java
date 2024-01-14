package AbstractFactory;

public class ItalianChair implements Chair {
	
	public ItalianChair(){
		System.out.println("Italian Chair");
	}

	@Override
	public void chairMake() {
		// TODO Auto-generated method stub
		System.out.println("Italian chair make");

	}

	@Override
	public void chairMaxWeight() {
		// TODO Auto-generated method stub
		System.out.println("italian cair max weight");
	}

}

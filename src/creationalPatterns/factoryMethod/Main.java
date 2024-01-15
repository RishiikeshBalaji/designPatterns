package creationalPatterns.factoryMethod;

import java.util.Scanner;

public class Main {
	
	public void execute() {
		String request = new String();
		System.out.println("Enter food");
		Scanner sc = new Scanner(System.in);
		
		request = sc.next();
		
		FoodFactory f = new FoodFactory(request);
		f.prepareFood();

        sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Inside main");
		Main mainInstance = new Main();
		mainInstance.execute();
		

	}

}
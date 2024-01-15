package creationalPatterns.builder;

class House {
	
	int no_of_rooms,windows,doors;
	String paint;
	Boolean hasSwimmingPool,hasGarden,hasStatues;
	public House(int no_of_rooms, int windows, int doors, String paint, Boolean hasSwimmingPool, Boolean hasGarden,
			Boolean hasStatues) {
		
		System.out.println("Building house");
		this.no_of_rooms = no_of_rooms;
		this.windows = windows;
		this.doors = doors;
		this.paint = paint;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasGarden = hasGarden;
		this.hasStatues = hasStatues;
	}
	

	
}

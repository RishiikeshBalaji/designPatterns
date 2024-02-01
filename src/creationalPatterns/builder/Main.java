package creationalPatterns.builder;


class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world");

		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.set_room(new Room());
		houseBuilder.setWindows(10);
		houseBuilder.setDoors(5);
		houseBuilder.setPaint("Red");
		houseBuilder.setHasSwimmingPool(true);
		houseBuilder.setHasGarden(true);
		houseBuilder.setHasStatues(true);

		

		House house = houseBuilder.houseBuild();
		System.out.println(house);

		house.no_of_rooms.get_info_of_room();
		
	}
}

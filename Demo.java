public class Demo {
	public static void main(String[] args) {
		Radio myRadio = new Radio();
		myRadio.setBrand("RCA");
		myRadio.tuneTo(100.3); 
		System.out.println("Brand: " + myRadio.getBrand());
		System.out.println("Current Station: " + myRadio.getCurrentSetting());
		System.out.println(myRadio.toString());
		
		//create an object of Television
		
		//setBrand to LG
		//tuneTo channel 4
		//print Brand
		//print currentStation
		//call toString method to display all information
		Television myTelevision = new Television();
		myTelevision.setTelevisionBrand("LG");
		myTelevision.tuneTo(4);
		System.out.println("Brand: " + myTelevision.getTelevisionBrand());
		System.out.println("Current Station: " + myTelevision.getCurrentSetting());
		System.out.println(myTelevision.toString()); 
	}

}

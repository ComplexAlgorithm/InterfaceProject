public class Radio extends Object implements Tunable {  //extends is the keyword use to create an inheritance relationship
										 				//implements is what use to connect a class to an interface
	//instance variables
	private String brand;
	private double currentStation;  
	
	//default constructor
	public Radio() {
		super(); //calls the default constructor of the parent class (Object)
		brand = "";
		currentStation = 88.0; 
	}
	
	//non-static methods
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	//override the toString method which is inherited from the Object class
	//because of the inheritance relationship
	public String toString() {
		return "Brand: " + brand + " Current Station: " + currentStation;
	}
	
	//these methods must be implemented because Radio agreed to implement the Tunable interface
	@Override
	public void tuneTo(double newSetting) {
		if(newSetting >= 88.0 && newSetting <= 107.9) {
			currentStation = newSetting;
		}
	}

	@Override
	public double getCurrentSetting() {
		return currentStation;
	}

}

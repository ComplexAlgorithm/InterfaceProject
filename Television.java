
public class Television extends Object implements Tunable {
	//instance variables
	//brand of the television
	//currentStation must be limited to whole numbers
	private String televisionBrand;
	private int currentStation;
	
	public Television() {
		//default constructor
		//set brand to the empty string
		//set currentStation to 3
		super();
		televisionBrand = "";
		currentStation = 3;
	}
	//setBrand
	public void setTelevisionBrand(String newTelevisionBrand) {
		televisionBrand = newTelevisionBrand;
	}
	//getBrand
	public String getTelevisionBrand() {
		return televisionBrand;
	}
	//override the toString method to return brand and currentStation
	public String toString() {
		return " Television Brand: " + televisionBrand + "\n" + " Current Station: " + currentStation;
	}
	//implement these two methods
	//tuneTo make sure the newSetting is between 3 and 99
	@Override
	public void tuneTo(double newSetting) {
		if(newSetting >= 3 && newSetting <= 99) {
			currentStation = (int)newSetting;
		}

	}
	
	//return the currentStation as a double 
	@Override
	public double getCurrentSetting() {
		return (double)     currentStation;
	}

}
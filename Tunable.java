
public interface Tunable {
	//interfaces are not classes, they do not have instance variables, constructors or method definitions
	//they do have method headings which serve as requirements for a class to implement
	//or as a blueprint for a class
	
	//should change the setting to the newSetting
	public void tuneTo(double newSetting); //this is a method heading
	
	//should return the current setting
	public double getCurrentSetting(); //this is a method heading
}

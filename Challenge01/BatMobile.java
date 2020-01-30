package Homework_Abstract_Class_Challenge01;

public class BatMobile {
	
	//Attribute
	String plateID;
	float weight;
	boolean isBatManHere = true;
	
	public BatMobile(String plateID, float weight, boolean isBatManHere) {
		this.plateID = plateID;
		this.weight = weight;
		this.isBatManHere = isBatManHere;
	}

	public int getMaximalSpeed() {
		int result;
		if(isBatManHere) {
			result = 500;
		}else {
			result = 110;
		}
		return result;
	}
	
	public String toString() {
		return "BatMobile [plate id " + plateID +", "+ "weight =" + weight + "]";
	}
}

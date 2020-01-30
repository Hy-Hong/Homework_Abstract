package Homework_Abstract_Challenge02;

public class BatMobile extends Vechicle{
	
	//Attribute
	boolean isBatManHere = true;
	
	public BatMobile(String plateID, float weight, boolean isBatManHere) {
		this.plateID = plateID;
		this.weight = weight;
		this.isBatManHere = isBatManHere;
	}
	
	@Override
	public int getMaximalSpeed() {
		int result;
		if(isBatManHere) {
			result = 500;
		}else {
			result = 110;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "BatMobile [plate id " + plateID +", "+ "weight =" + weight + "]";
	}
}

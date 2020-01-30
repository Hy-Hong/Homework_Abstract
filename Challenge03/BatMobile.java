package Homework_Abstract_Challenge03;


public class BatMobile extends Vechicle{
	boolean isBatmanHere;
	public  BatMobile(String plateID,float weight,boolean isBatmanHere) {
		this.plateID = plateID;
		this.weight = weight;
		this.isBatmanHere = isBatmanHere;
	}
	@Override
	public String toString() {
		return("BatMobile" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int result;
		if(isBatmanHere) {
			result = 500;
		}else {
			result = 110;
		}
		return result;
		
	}
}

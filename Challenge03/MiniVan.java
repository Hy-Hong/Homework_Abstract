package Homework_Abstract_Challenge03;

public class MiniVan  extends Vechicle{
	int nbCustomers;
	public  MiniVan(String plateID,float weight,int nbCustomer) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomer;
		
	}
	@Override
	public String toString() {
		return("MiniVan" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int maximalspeed = 130;
		int result = 0;
	if(nbCustomers!= 0) {
		result = maximalspeed - 10 * nbCustomers;
	}
	return result;
	}
}

package Homework_Abstract_Challenge03;


public class TucTuc  extends Vechicle{
	int nbCustomers;
	public  TucTuc(String plateID,float weight,int nbCustomer) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomer;
	}
	@Override
	public String toString() {
		return("TucTuc" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int maximalspeed = 130;
		int result = 0;
	if(nbCustomers!= 0) {
		result = maximalspeed - 5 * nbCustomers;
	}
	return result;
		
	}
}

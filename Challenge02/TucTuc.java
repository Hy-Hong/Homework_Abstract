package Homework_Abstract_Challenge02;

public class TucTuc extends Vechicle{
	
	int nbCustomer;
	//Contracts
	public TucTuc(String plateID, float weight, int nbCustomer) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomer = nbCustomer;
	}
	
	@Override
	public int getMaximalSpeed() {
		int maxSpeed = 130;
		int resultTuctuc =0;
		if(nbCustomer !=0 ) {
			resultTuctuc = maxSpeed - (nbCustomer * 5);
		}
		return resultTuctuc;
		 
	}
	
	@Override
	public String toString() {
		return "TucTuc [plate id " + plateID +", "+ "weight =" + weight + "]";
	}
}

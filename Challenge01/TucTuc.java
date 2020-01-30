package Homework_Abstract_Class_Challenge01;

public class TucTuc{
	
	String plateID;
	float weight;
	int nbCustomer;
	//Constracts
	public TucTuc(String plateID, float weight, int nbCustomer) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomer = nbCustomer;
	}
	public int getMaximalSpeed() {
		int maxSpeed = 130;
		int resultTuctuc =0;
		if(nbCustomer !=0 ) {
			resultTuctuc = maxSpeed - (nbCustomer * 5);
		}
		return resultTuctuc;
		 
	}
	
	public String toString() {
		return "TucTuc [plate id " + plateID +", "+ "weight =" + weight + "]";
	}
}

package Homework_Abstract_Challenge02;

public class MiniVan extends Vechicle{

	int nbCustomer;
	//contractor
	public MiniVan(String plateID, float weight, int nbCustomer) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomer = nbCustomer;
	}
	//Method
	@Override
	public int getMaximalSpeed() {
		int maxSpeedOfMiniVan = 130;
		int resultMiniVan = 0;
		if(nbCustomer != 0) {
			resultMiniVan = maxSpeedOfMiniVan - (nbCustomer * 10);
		}
		return resultMiniVan;
	}
	
	@Override
	public String toString() {
		return "MiniVan [plate id " + plateID +", "+ "weight =" + weight + "]";
	}
}

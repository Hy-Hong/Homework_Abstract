package Homework_Abstract_Challenge03;



public abstract class Vechicle {
	String plateID;
	float weight;
	public  String toString() {
		return" [plate id = "+ plateID +"," + " weight= "+ weight +"] " + "speed is ";
	}
	public abstract int getMaximalSpeed();
}
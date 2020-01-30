package Homework_Abstract_Challenge03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VechicleConvoy {
	List<Vechicle> listVechicle = new ArrayList<>();
	
	 public void addVehicle(Vechicle vechicle){
		// System.out.println(Vechicle);
		 listVechicle.add(vechicle);
		// System.out.println(listVechicle);
		
	}
	int getMaximalSpeed(){
		List speeds = new ArrayList<>();
		for(Vechicle speed : listVechicle ) {
			speeds.add(speed.getMaximalSpeed());
			//System.out.println(speeds);
		}
		int lowest = 0;
		for(int i = 0; i < speeds.size(); i++) {
			lowest = (int) Collections.min(speeds);
		}
		return lowest;
		 
	 }
}



package com.dibas.car;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


@Named
public class FamilyCar {
	
	private Engine myEngine;

	public Engine getMyEngine() {
		return myEngine;
	}

	public void setMyEngine(Engine myEngine) {
		this.myEngine = myEngine;
	}
	
	
	public String getCarDescription() {
		
		String result = "";
		
		if(myEngine != null) { result += "Engine Size : "+ myEngine.getNumberOfCylinder();}
		//if(result == null) result += "Nothing is set for this car";
		
		return result;
	}
	
	
	
}

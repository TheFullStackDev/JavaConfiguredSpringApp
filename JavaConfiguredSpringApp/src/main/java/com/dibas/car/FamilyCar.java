package com.dibas.car;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class FamilyCar {

	
	
	private Engine myEngine;
	
	//no-args / default constructor
	public FamilyCar() {}
	
	//non-default constructor
	public FamilyCar(Engine engine) {
		this.myEngine = engine;
	}

	public Engine getMyEngine() {
		return myEngine;
	}

	@Autowired
	@Qualifier("sixCyl")
	public void setMyEngine(Engine myEngine) {
		System.out.println("Setting Engine injection...");
		this.myEngine = myEngine;
	}

	public String getCarDescription() {

		String result = "";

		if (myEngine != null) {
			result += "Engine Size : " + myEngine.getNumberOfCylinder();
		}
		 if(result == "") result = "Nothing is set for this car";

		return result;
	}

}

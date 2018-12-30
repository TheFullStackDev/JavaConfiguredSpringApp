package com.dibas.car;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

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

	public void setMyEngine(Engine myEngine) {
		this.myEngine = myEngine;
	}

	@SuppressWarnings("unused")
	public String getCarDescription() {

		String result = "";

		if (myEngine != null) {
			result += "Engine Size : " + myEngine.getNumberOfCylinder();
		}
		 if(result == null) {
			 result = "Nothing is set for this car";
		 }

		return result;
	}

}

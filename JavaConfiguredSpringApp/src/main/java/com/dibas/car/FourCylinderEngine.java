package com.dibas.car;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named("FourCylinderEngine")
public class FourCylinderEngine implements Engine {

	public int getNumberOfCylinder() {

		return 4;
	}

	public String drive() {

		return "Driving efficiently with 4 cylinders.";
	}

}

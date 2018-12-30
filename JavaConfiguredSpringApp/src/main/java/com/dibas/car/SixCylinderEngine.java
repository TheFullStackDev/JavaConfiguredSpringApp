package com.dibas.car;

import javax.inject.Named;

@Named
public class SixCylinderEngine  implements Engine {

	public int getNumberOfCylinder() {

		return 6;
	}

	public String drive() {

		return "Driving with 6 cylinders.";
	}

}

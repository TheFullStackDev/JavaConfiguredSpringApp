package com.dibas.car;

import org.springframework.stereotype.Component;

@Component("sixCyl")
public class SixCylinderEngine  implements Engine {

	public int getNumberOfCylinder() {

		return 6;
	}

	public String drive() {

		return "Driving with 6 cylinders.";
	}

}

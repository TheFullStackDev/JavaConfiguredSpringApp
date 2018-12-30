package com.dibas.car;

import org.springframework.stereotype.Component;

@Component
public class BigTier implements Tier{

	private String diameter = "22 inch Diameter";
	
	public String getTierDiameter() {
		return diameter;
	}

	public String roll() {
		// TODO Auto-generated method stub
		return null;
	}

}
package com.dibas.car;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Named
public class FamilyCar {

	/*// @Resource(name="smallTier")
	// @Qualifier(value="sTier")
	// @Inject
	// @Named("smallTier")
	@Autowired
	private Tier frontLeft;
	// @Resource(name="smallTier")
	// @Qualifier(value="sTier")
	// @Inject
	// @Named("smallTier")
	@Autowired
	private Tier frontRight;
	// @Resource(name="bigTier")
	// @Qualifier(value="bTier")
	// @Inject
	// @Named("bigTier")
	@Autowired
	private Tier rearLeft;
	// @Resource(name="bigTier")
	// @Qualifier(value="bTier")
	// @Inject
	// @Named("bigTier")
	@Autowired
	private Tier rearRight;
	// @Resource(name="sixCyl")
	// @Qualifier("fourCyl")
	// @Inject
	// @Named("sixCyl")
	@Autowired
	private Engine engineType;

	public Tier getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Tier frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tier getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Tier frontRight) {
		this.frontRight = frontRight;
	}

	public Tier getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Tier rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tier getRearRight() {
		return rearRight;
	}

	public void setRearRight(Tier rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	public String getDescription() {

		String desc = "";

		if (frontLeft != null) {
			desc += "\nFront Left tier: " + frontLeft.getTierDiameter();
		}
		if (frontRight != null) {
			desc += "\nFront Right tier: " + frontRight.getTierDiameter();
		}
		if (rearLeft != null) {
			desc += "\nRear Left tier: " + rearLeft.getTierDiameter();
		}
		if (rearRight != null) {
			desc += "\nRear Right tier: " + rearRight.getTierDiameter();
		}
		if (engineType != null) {
			desc += "\nEngine : " + engineType.getNumberOfCylinder() + "\n" + engineType.drive();
		}
		if (desc == null || desc == "") {
			desc += "not set yet";
		}

		return desc;
	}
*/
	
	//@Autowired
	//@Qualifier(value="FourCylinderEngine")
	@Inject
	@Named(value="FourCylinderEngine")
		
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

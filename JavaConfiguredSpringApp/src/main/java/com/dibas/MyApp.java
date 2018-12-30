package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dibas.car.FamilyCar;
import com.dibas.car.FourCylinderEngine;
import com.dibas.car.SixCylinderEngine;

import config.AppConfig;

public class MyApp {

	public static void main(String[] args) {

		//ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Engine sixCyl = (Engine) appContext.getBean("sixCyl");
		//System.out.println("sixCyl : No of Cylinder :"+sixCyl.getNumberOfCylinder());
		
		//Engine fourCyl = (Engine) appContext.getBean("fourCyl");
		//System.out.println("fourCyl : No of Cylinder :"+fourCyl.getNumberOfCylinder());
		
		//FamilyCar familyCar = (FamilyCar) appContext.getBean("familyCar");
		//System.out.println("Car Description :"+familyCar.getCarDescription());
		
		//FamilyCar familyCar = (FamilyCar) appContext.getBean("familyCarConst");
		//System.out.println("Constructor Injection :"+familyCar.getCarDescription());
		
		
		SixCylinderEngine mySixEngine = (SixCylinderEngine) appContext.getBean("sixCyl");
		//SixCylinderEngine mySixEngine =  appContext.getBean(SixCylinderEngine.class);
		System.out.println("my SixEngine : "+mySixEngine.drive());
		
		FourCylinderEngine myFourEngine = (FourCylinderEngine) appContext.getBean("fourCyl");
		System.out.println("my FourEngine : "+myFourEngine.drive());
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}

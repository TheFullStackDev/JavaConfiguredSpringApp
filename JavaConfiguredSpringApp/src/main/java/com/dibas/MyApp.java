package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dibas.car.FamilyCar;

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
		
		FamilyCar familyCar = (FamilyCar) appContext.getBean("familyCarConst");
		System.out.println("Constructor Injection :"+familyCar.getCarDescription());
		
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}

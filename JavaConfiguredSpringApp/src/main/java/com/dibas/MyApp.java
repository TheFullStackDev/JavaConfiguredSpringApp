package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.car.BigTier;
import com.dibas.car.Engine;
import com.dibas.car.FamilyCar;
import com.dibas.car.SmallTier;

import config.AppConfig;

public class MyApp {

	public static void main(String[] args) {

		//ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Engine sixCyl = (Engine) appContext.getBean("sixCyl");
		System.out.println("sixCyl : No of Cylinder :"+sixCyl.getNumberOfCylinder());
		
		Engine fourCyl = (Engine) appContext.getBean("fourCyl");
		System.out.println("fourCyl : No of Cylinder :"+fourCyl.getNumberOfCylinder());
		
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}

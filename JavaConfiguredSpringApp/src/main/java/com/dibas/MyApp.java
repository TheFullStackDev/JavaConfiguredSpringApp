package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dibas.car.FamilyCar;

import config.AppConfig;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		FamilyCar familyCar = (FamilyCar) appContext.getBean("familyCar");
		System.out.println(familyCar.getCarDescription());

		((AnnotationConfigApplicationContext) appContext).close();

	}

}

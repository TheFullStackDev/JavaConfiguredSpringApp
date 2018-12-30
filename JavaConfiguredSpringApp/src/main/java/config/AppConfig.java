package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dibas.car.FamilyCar;
import com.dibas.car.FourCylinderEngine;
import com.dibas.car.SixCylinderEngine;

@Configuration
@ComponentScan({"com.dibas.car"})
public class AppConfig {

	@Bean(name = "fourCyl")
	public FourCylinderEngine getFourCyl() {
		return new FourCylinderEngine();
	}
	
	@Bean(name = "sixCyl")
	public SixCylinderEngine getSixCyl() {
		return new SixCylinderEngine();
	}
	
	/*@Bean(name="familyCar")
	public FamilyCar getFamilyCar() {
		
		//Create instance
		FamilyCar myCar = new FamilyCar();
		
		//Injection using engine type bean
		myCar.setMyEngine(getSixCyl());
		
		return myCar;
	}
	
	@Bean(name="familyCarConst")
	public FamilyCar getFamilyCarConst() {
		
		//Create instance
		FamilyCar myCar = new FamilyCar();
		
		return myCar;
	}
	
	*/
	
}

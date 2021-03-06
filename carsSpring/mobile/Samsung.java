package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung extends Phone {

	
	private OperatingSystem operatingSystem;
	
	@Autowired
	public Samsung(@Qualifier("androidOperatingSystem")  OperatingSystem operatingSystem) {
		super();
	
		this.operatingSystem = operatingSystem;
	}
	
	
	
	public void display() {
		System.out.println("Samsung");
		operatingSystem.showDetails();
		
	}

}

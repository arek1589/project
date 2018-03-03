package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tablet implements MobileDevice{

	private  OperatingSystem operatingSystem;
	
	@Autowired
	public Tablet(@Qualifier("androidOperatingSystem") OperatingSystem operatingSystem) {
		super();
		this.operatingSystem = operatingSystem;
	}

	public void display() {
		System.out.println("Tablet");
		operatingSystem.showDetails();
		
	}

}

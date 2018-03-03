package pl.sda.spring.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("iphone")
public class IPhone extends Phone{

	
	private OperatingSystem operatingSystem;
	
	@Autowired
	public IPhone(@Qualifier("iosoperatingSystem")OperatingSystem operatingSystem) {
		super();
		
		this.operatingSystem = operatingSystem;
	}
	
	public void display() {
		System.out.println("IPhone");
		operatingSystem.showDetails();
			}

}

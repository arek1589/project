package pl.sda.spring.mobile;

import org.springframework.stereotype.Component;

@Component("iosoperatingSystem")
public class IOSOperatingSystem implements OperatingSystem {

	public void showDetails() {
		System.out.println("System operacyjny IOS ");
		
	}

}

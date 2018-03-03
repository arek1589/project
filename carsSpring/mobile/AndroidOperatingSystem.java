package pl.sda.spring.mobile;

import org.springframework.stereotype.Component;

@Component("androidOperatingSystem")
public class AndroidOperatingSystem implements OperatingSystem{

	public void showDetails() {
		System.out.println("System operacyjny Android");
		
	}

}

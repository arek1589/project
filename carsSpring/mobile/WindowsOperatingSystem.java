package pl.sda.spring.mobile;

import org.springframework.stereotype.Component;

@Component("windowsOperatingSystem")
public class WindowsOperatingSystem implements OperatingSystem{

	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("System.operacyjny Windows");
	}

}

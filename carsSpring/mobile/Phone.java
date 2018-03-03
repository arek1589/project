package pl.sda.spring.mobile;

public abstract class Phone implements MobileDevice {
	
	
private OperatingSystem operatingSystem ;

public OperatingSystem getOperatingSystem() {
	return operatingSystem;
}

public void setOperatingSystem(OperatingSystem operatingSystem) {
	this.operatingSystem = operatingSystem;
}


}

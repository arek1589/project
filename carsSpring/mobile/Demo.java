package pl.sda.spring.mobile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;




public class Demo {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);

	        MobileDevice mobileDevice = (MobileDevice) context.getBean("samsung");
	        mobileDevice.display();
	        
	        MobileDevice mobileDevice1 = (MobileDevice) context.getBean("iphone");
	        mobileDevice1.display();
	    
	        MobileDevice mobileDevice2 = (MobileDevice) context.getBean("tablet");
	        mobileDevice2.display();

	        context.close();

	}

}

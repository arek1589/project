package pl.sda.spring.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pl.sda.spring.car.Car;
import pl.sda.spring.car.CarConfiguration;

public class Demo {

	public static void main(String[] args) {

		
	     AbstractApplicationContext context = new AnnotationConfigApplicationContext(WebCrawlerConfig.class);

	     FileWebCrawler file = (FileWebCrawler) context.getBean("fileWebCrawler");
	     file.search();


	        context.close();
	}

}

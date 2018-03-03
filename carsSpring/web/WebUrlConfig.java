package pl.sda.spring.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class WebUrlConfig {

	public List<String> getUrls() {
		List<String> url = new ArrayList<String>();
		url.add("http://www.onet.pl/");
		url.add("http://www.interia.pl/");
		url.add("http://www.wp.pl/");

		for (int i = 0; i < url.size(); i++) {
			System.out.println(url.get(i));
		}
		return url;

	}
	
}

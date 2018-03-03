package pl.sda.spring.web;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.sda.spring.web")
public class WebCrawlerConfig {

	@Bean
	public HttpClient createHttpClient() {
		HttpClientBuilder builder = HttpClientBuilder.create();
	   return builder.build();
	}
	
}

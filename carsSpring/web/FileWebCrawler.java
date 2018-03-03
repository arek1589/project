package pl.sda.spring.web;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileWebCrawler implements WebClawler{

@Autowired
private WebUrlConfig webUrlConfig;

	@Autowired
	private HttpClient httpClient;
	public void search() {
		
		for(String url:webUrlConfig.getUrls()){
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(new FileWriter("C:/Users/RENT/webclowler.txt", true),true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				HttpResponse httpresponse =	httpClient.execute(new HttpGet(url));
				String wbepage = IOUtils.toString(httpresponse.getEntity().getContent(),"UTF-8");
				pw.println(wbepage);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.close();
		}
		// TODO Auto-generated method stub
		//File file = new File("C:/Users/RENT/webclowler.txt");
		
	}

}

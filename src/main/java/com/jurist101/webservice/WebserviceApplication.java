package com.jurist101.webservice;

import com.jurist101.webservice.models.LawData;
import com.jurist101.webservice.models.MainApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebserviceApplication.class, args);

//		LawData lawData = context.getBean(LawData.class);
//		lawData.showName();
		MainApp mainApp = context.getBean(MainApp.class);
		//mainApp.showName();


	}

}

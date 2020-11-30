package com.parroquia;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	//Jorge Jacinto
	//Leonardo Jacinto
	//Abigail Aldave Huaman
	//camilo Vega
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SistempaqApplication.class);
	}

}

package org.uvsq.ds.springmvc101.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.uvsq.ds.springmvc101.ScanPackageRoot;

@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses = ScanPackageRoot.class)
public class WebConfig {
	
	private static Logger logger = LoggerFactory.getLogger(WebConfig.class); 
	
	public WebConfig() {
		logger.info("WebConfig Creation");
	}

}
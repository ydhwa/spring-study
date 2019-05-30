package com.cafe24.springex.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cafe24.springex.config.WebConfig;

public class SpringexWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// AppConfig
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// WebConfig
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}


}

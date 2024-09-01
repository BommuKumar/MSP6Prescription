package com.naresh.Database.RequestInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class FeignRequestInterceptor implements RequestInterceptor {

	
	@Autowired
	HttpServletRequest request;
	
	@Override
	public void apply(RequestTemplate template) {
	 
		
		template.header("Authorization",request.getHeader("Authorization"));
		
	}
	
	
	

}

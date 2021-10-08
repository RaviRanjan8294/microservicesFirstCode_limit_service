package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix= "limit-service")
public class Configuration {
	//@Value("${limit-service.maximum}")
	private int maximum;
	//@Value("${limit-service.minimum}")
	private int minimum;
	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	

}

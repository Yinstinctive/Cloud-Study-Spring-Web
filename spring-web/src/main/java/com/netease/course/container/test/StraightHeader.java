package com.netease.course.container.test;

import java.util.Map;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("header")
public class StraightHeader implements Header {
	@Value("${color}")
	private String color;
	@Value("${size}")
	private int size;
	
	public StraightHeader() {}
	
//	public void setColor(String color) {
//		this.color=color;
//	}
//	
//	public void setSize(int size) {
//		this.size=size;
//	}
	
	public StraightHeader(String color, int size) {
		this.color=color;
		this.size=size;
	}
	
	public StraightHeader(Map<String, String> paras) {
		this.color=paras.get("color");
		this.size=Integer.valueOf(paras.get("size"));
	}
	
	public StraightHeader(Properties props) {
		this.color=color;
		this.size=size;
	}

	public void doWork() {
		System.out.println("Do work with straightheader");
	}

	public String getInfo() {
		return "Straightheader: color="+color+", size="+size;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init the header");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy the header");
	}
}

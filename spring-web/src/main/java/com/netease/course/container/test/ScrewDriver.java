package com.netease.course.container.test;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

public class ScrewDriver {
//	@Resource
	@Autowired
	private Header header;
	
	public ScrewDriver() {}
	
	public ScrewDriver(Header header) {
		this.header=header;
	}
	
//	public void setHeader(Header header) {
//		this.header=header;
//	}
	
	public void use() {
		System.out.println("Use header: "+ header.getInfo());
		header.doWork();
	}
	
	public void init() {
		System.out.println("Init screwdriver");
	}
	
	public void cleanup() {
		System.out.println("Destroy screwdriver");
	}
}

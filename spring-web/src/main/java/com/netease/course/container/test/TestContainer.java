package com.netease.course.container.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		
		ScrewDriver screwDriver=context.getBean("screwDriver", ScrewDriver.class);
		screwDriver.setColor("green");
		screwDriver.use();
		
		ScrewDriver screwDriver1=context.getBean("screwDriver", ScrewDriver.class);
		screwDriver1.use();
		
		((ConfigurableApplicationContext)context).close();
	}

}

package com.xworkz.Spring.bean.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.Spring.bean.SeasonBean;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Context.xml");
		
		SeasonBean bean=context.getBean("bean",SeasonBean.class);
		bean.setName("bean ref:"+bean);
		
		
		SeasonBean bean1=context.getBean("bean",SeasonBean.class);
	System.out.println("bean ref:"+bean);
		
	}

}

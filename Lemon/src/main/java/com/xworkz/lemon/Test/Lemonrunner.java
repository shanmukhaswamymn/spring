package com.xworkz.lemon.Test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.lemon.bean.LemonBean;

public class Lemonrunner {
	
	public static void main(String[] args) {
		
ApplicationContext context =new ClassPathXmlApplicationContext("context.xml");
		
		LemonBean lemon=context.getBean("bean",LemonBean.class);
		
		lemon.matamantra();
		System.out.println(Arrays.toString(lemon.getNums()));
		
	}

}

package com.xworkz.lemon.bean;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import lombok.Data;
@Data
public class LemonBean {
	
	String mantravadi;
	String location;
	int[] nums;
	ArrayList<String>mantravdii;
	Map<String,String>vadis;
	Properties mantravadies;
	
	public void matamantra() {
		for (String string : mantravdii) {
			System.out.println(string);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i);
		}
		System.out.println( mantravadi+"is famous for matamantra");
//		System.out.println("avsilable mantravadis");
//		System.out.println("mantravadi");
//		System.out.println(location+"mantravadi address");
//		System.out.println(vadis);
//		System.out.println(mantravadies);
	}
	
	



}

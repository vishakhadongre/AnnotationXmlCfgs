package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		WeekDayFinder wdf = ctx.getBean("wdf", WeekDayFinder.class);
		try {
			String msg = wdf.showWeekDayName();
			System.out.println("WeekDay Name: " +msg);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
	
	}

}

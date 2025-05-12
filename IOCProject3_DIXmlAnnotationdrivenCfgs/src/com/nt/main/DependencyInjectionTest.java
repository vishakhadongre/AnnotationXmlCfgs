package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("sf");
		SeasonFinder sf = (SeasonFinder)obj;
		try {
			String msg = sf.showSeasonName();
			System.out.println("Season name: " +msg);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
	}

}

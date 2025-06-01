package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
   
   public WeekDayFinder() {
	   System.out.println("WeekDayFinder:: 0-param constructor");
   }
   
   public String showWeekDayName() {
	   System.out.println("WeekDayFinder.showWeekDayName()");
	   LocalDate currentDate = LocalDate.now();
       DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
       int week = dayOfWeek.getValue();
	   if(week>=1 && week <=5) {
		   return "Happy Working day";
	   } else {
		   return "Happy Weekend";
	   }
   }
}


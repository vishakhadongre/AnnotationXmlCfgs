package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
  private LocalDate date;
  
  public SeasonFinder(){
	  System.out.println("SeasonFinder:: 0-param constructor");
  }
  
  @Autowired
  public void setDate(LocalDate date) {
	  System.out.println("SeasonFinder.setDate()");
	  this.date = date;
  }
  
  public String showSeasonName() {
	  System.out.println("SeasonFinder.showSeasonName()");
	  int month = date.getMonthValue();
	  if(month>=3 && month<=6) {
		  return "Summer Season";
	  } else if(month>=7 && month<=10) {
		  return "Rainy Season";
	  } else {
		  return "Winter Season";
	  }
	  
  }
}

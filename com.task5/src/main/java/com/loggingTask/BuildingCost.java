package com.loggingTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuildingCost {
	private static Logger LOGGER = LogManager.getLogger(BuildingCost.class);
	public static void buildCost(String s,int area) {
	int k=1;
	if(s.equalsIgnoreCase("standard")) {
		k=1200;
	}
	if(s.equalsIgnoreCase("above standard")) {
		k=1500;
	}
	if(s.equalsIgnoreCase("high standard")) {
		k=1800;
	} 
	if(s.equalsIgnoreCase("high standard and automated")) {
		k=2500;
	}
	int Total_Cost = k*area;
	LOGGER.debug("the total building cost is "+Total_Cost);
	}
	public static void main(String[] args) {
		String str[]= {"standard","above standard","high standard","high standard and automated"};
		int area=30;
		for(int index = 0;index<str.length;index++) {
			buildCost(str[index],area);
		}
		
	}
	

}

package com.loggingTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	private static Logger LOGGER =LogManager.getLogger(Interest.class);
	public static void main(String[] args) {
		Simple();
		comp();

	}
	public static void Simple() {
	int principle=1000;
	float rate=5;
	float time=2;
	double Simple_Interest=(principle*time*rate)/100;
	LOGGER.error("the simple interest is "+Simple_Interest);
}
public static void comp() {
	int principle=1000;
	float rate=5;
	float no_of_years=3;
	float time=2;
	rate/=100;
	double Compound_interest=principle*Math.pow((1+ rate/no_of_years),no_of_years*time);
	LOGGER.error("the compound interest is "+Compound_interest);
}

}

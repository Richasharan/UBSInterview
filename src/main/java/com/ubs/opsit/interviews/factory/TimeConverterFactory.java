package com.ubs.opsit.interviews.factory;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.impl.BerlinClock;

public class TimeConverterFactory {
	
	public static TimeConverter getTimeConverter(String timeconverter) {
		
		if(timeconverter.equalsIgnoreCase("berlinclock"))
			return new BerlinClock();
		
		return null;
	}

}

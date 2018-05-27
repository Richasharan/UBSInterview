package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.exception.InvalidTimeException;
import com.ubs.opsit.interviews.utilities.Utilities;

public class BerlinClock implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		
		if( aTime == null || aTime.equals("") )
			throw new InvalidTimeException();
		
		String clock = null;
		
		try {
			
			int hours = Integer.parseInt(aTime.substring(0, 2));
			int minutes = Integer.parseInt(aTime.substring(3, 5));
			
			validateInputTime(hours, minutes);
			
			String topBulb = Utilities.getTopBulb(hours,minutes);
			String hourString = HourBulbs.getHourString(hours);
			String minuteString = MinuteBulbs.getMinuteString(minutes);
			
			clock = (topBulb + "\r\n" + hourString + "\r\n" + minuteString) ;
			
			
		}
		catch(NumberFormatException e) {
			throw new InvalidTimeException();
		}
		catch(InvalidTimeException e) {
			throw e;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return clock;
	}
	
	
	public void validateInputTime(int hours, int minutes) {
		
		String errorMsg = null ;
		
		if(hours<0 || hours>24)
			errorMsg = "Hours should be between 0 and 24" ;
		
		if(minutes<0 || minutes>59)
			errorMsg = errorMsg +" minutes should be between 0 and 59";
		
		if(errorMsg != null)
			throw new InvalidTimeException(errorMsg);
	}

}

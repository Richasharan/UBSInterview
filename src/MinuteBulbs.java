package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.utilities.Utilities;

public class MinuteBulbs {
	
	public static String getMinuteString(int minutes) {
		
		String[] fiveMinutes = new String[]{"O","O","O","O","O","O","O","O","O","O","O"};
		String[] oneMinute = new String[]{"O","O","O","O"};
		String bulb = "Y";
		
		StringBuilder sb = new StringBuilder();
		
		int fiveMinLimit = (minutes / 5);
		int oneMinLimit = (minutes % 5);
		
		sb = getfiveMinuteString(fiveMinLimit,fiveMinutes,sb);
		sb.append("\r\n");
		sb = Utilities.getTimeString(oneMinLimit,oneMinute,sb,bulb);
		
		return sb.toString();		
		
	}
	
	public static StringBuilder getfiveMinuteString(int minuteLimit, String[] minutes, StringBuilder sb) {
		
		for(int i=0; i<minuteLimit; i++) {
			minutes[i] = "Y";
		}
		
		if(minuteLimit >= 3)
			minutes[2]="R";
		
		if(minuteLimit >= 6)
			minutes[5]="R";
		
		if(minuteLimit >= 9)
			minutes[8]="R";
		
		return Utilities.getTimeString(minutes,sb);
		
	}
	
}

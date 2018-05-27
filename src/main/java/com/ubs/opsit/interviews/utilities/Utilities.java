package com.ubs.opsit.interviews.utilities;

public class Utilities {
	
	
	public static StringBuilder getTimeString(int limit, String[] time, StringBuilder sb, String bulb) {
		
		for(int i=0; i<limit; i++) {
			time[i] = bulb;
		}
		
		return getTimeString(time,sb);
		
	}
	
	public static StringBuilder getTimeString(String[] time, StringBuilder sb) {
		
		for(int i=0; i<time.length; i++) {
			sb.append(time[i]);
		}
		
		return sb;
	}
	
	
	public static String getTopBulb(int hours, int minutes) {
		
		if( ( (hours*60) + minutes ) % 2 == 0 )
			return "Y";
		else
			return "O";
		
	}

}

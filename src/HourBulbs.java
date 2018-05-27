package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.utilities.Utilities;

public class HourBulbs {
	
	public static String getHourString(int hours) {
		
		String[] fiveHours = new String[]{"O","O","O","O"};
		String[] oneHour = new String[]{"O","O","O","O"};
		String bulb = "R";
		
		StringBuilder sb = new StringBuilder();
		
		int fiveHrLimit = (hours / 5);
		int oneHrLimit = (hours % 5);
		
		sb = Utilities.getTimeString(fiveHrLimit, fiveHours, sb, bulb);
		sb.append("\r\n");
		sb = Utilities.getTimeString(oneHrLimit,oneHour,sb,bulb);
		
		return sb.toString();		
		
	}

}

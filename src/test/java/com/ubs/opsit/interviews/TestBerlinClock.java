package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ubs.opsit.interviews.exception.InvalidTimeException;
import com.ubs.opsit.interviews.factory.TimeConverterFactory;

public class TestBerlinClock {
	
	TimeConverter berlinClock = TimeConverterFactory.getTimeConverter("berlinClock");
	
	@Test
	public void testconvertTimeFirstScenario() {
		String aTime = "00:00:00";
		String expectedClock = "Y\r\n" + 
				"OOOO\r\n" + 
				"OOOO\r\n" + 
				"OOOOOOOOOOO\r\n" + 
				"OOOO";
		
		String berlinclock = berlinClock.convertTime(aTime);
		
		assertEquals(true , berlinclock.equals(expectedClock));
	}
	
	@Test
	public void testconvertTimeSecondScenario() {
		String aTime = "13:17:01";
		String expectedClock = "O\r\n" + 
				"RROO\r\n" + 
				"RRRO\r\n" + 
				"YYROOOOOOOO\r\n" + 
				"YYOO";
		
		String berlinclock = berlinClock.convertTime(aTime);
		
		assertEquals(true , berlinclock.equals(expectedClock));
	}
	
	@Test
	public void testconvertTimeThirdScenario() {
		String aTime = "23:59:59";
		String expectedClock = "O\r\n" + 
				"RRRR\r\n" + 
				"RRRO\r\n" + 
				"YYRYYRYYRYY\r\n" + 
				"YYYY";
		
		String berlinclock = berlinClock.convertTime(aTime);
		
		assertEquals(true , berlinclock.equals(expectedClock));
	}
	
	@Test
	public void testconvertTimeFourthScenario() {
		String aTime = "24:00:00";
		String expectedClock = "Y\r\n" + 
				"RRRR\r\n" + 
				"RRRR\r\n" + 
				"OOOOOOOOOOO\r\n" + 
				"OOOO";
		
		String berlinclock = berlinClock.convertTime(aTime);
		
		assertEquals(true , berlinclock.equals(expectedClock));
	}
	
	@Test
	public void testconvertTimeInvalidTimeFirstScenario() {
		String aTime = null;
		boolean isInvalid = false;
		
		try {
			String berlinclock = berlinClock.convertTime(aTime);
		}
		catch(InvalidTimeException e) {
			isInvalid = true;
		}
		
		assertEquals(true , isInvalid);
	}
	
	@Test
	public void testconvertTimeInvalidTimeSecondScenario() {
		String aTime = "26:63:17";
		boolean isInvalid = false;
		
		try {
			String berlinclock = berlinClock.convertTime(aTime);
		}
		catch(InvalidTimeException e) {
			isInvalid = true;
		}
		
		assertEquals(true , isInvalid);
	}

}

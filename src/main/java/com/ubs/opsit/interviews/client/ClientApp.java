package com.ubs.opsit.interviews.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.factory.TimeConverterFactory;

public class ClientApp {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String berlinClock = null;
		String aTime = null;
		String userInput = "Y";
		TimeConverter timeConverter = TimeConverterFactory.getTimeConverter("berlinclock");
		
		System.out.println("Welcome to Berlin Clock !!");
		
		try {
			while(!userInput.equals("N")) {
				
				System.out.println("Enter the Time in HH:MM:SS format to convert to Berlin Clock ::::");
				aTime = br.readLine();
					
				berlinClock = timeConverter.convertTime(aTime);
					
				System.out.println("\n\n Berlin Clock ::::");
				System.out.println(berlinClock);
					
				System.out.println("Do you want to continue ? (Y/N)");
				userInput = br.readLine();	
			}
			
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

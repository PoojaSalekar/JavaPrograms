package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//Created by Pooja Salekar 

public class HandlingDateTime {

	public static void main(String[] args) {
		LocalDate currentDate =LocalDate.now();
		System.out.println("Current Date :"+currentDate);
		
		LocalTime currentTime =LocalTime.now();
		System.out.println("Current DTime :"+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time :"+currentDateTime);
		
		//setting date by passing string
		LocalDate date = LocalDate.parse("2000-11-12");
		System.out.println("Date  :"+date);
		
		//setting date by passing integers
		LocalDate date1 = LocalDate.of(2021,3,8);
		System.out.println("Date  :"+date1);
		
		//retriving tomarro and yesterday date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's date :"+yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's date :"+tomorrow);
		
		//changing date time format 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh-mm-ss");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Date(dd-mm-yyyy  format"+formattedDate);
		
		//handling zones
		ZonedDateTime zonedDate = ZonedDateTime.now();
		System.out.println("Date with zone :"+zonedDate);
		System.out.println("current zone :"+zonedDate.getZone());
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");    //setting tokyo zone
		ZonedDateTime tokyoZone = zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date (tokyo zone) :"+tokyoZone);
	}

}

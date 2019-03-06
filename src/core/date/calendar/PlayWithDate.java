package core.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PlayWithDate {

	public static void main(String[] args) {
		

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date); //15/10/2013
		
		System.out.println(System.currentTimeMillis()); 
		
		
		System.out.println(Calendar.getAvailableCalendarTypes()); 

		Calendar cal= Calendar.getInstance();
		Date dt=new Date();
		System.out.println( dt ); 
		
	}

}

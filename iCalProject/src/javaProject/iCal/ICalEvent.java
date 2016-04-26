package javaProject.iCal;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ICalEvent {
	
	private class ICalData{
		
		private String title;						// nazwa zdarzenia
		private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");;
		private Calendar startDate;					// data rozpoczecia
		private Calendar endDate;					// data zakonczenia
		private String description;					// opis 
		private String location;					// miejsce
		private URL urlAddress;						// adres powiazanej strony
		
		public ICalData(){
			title = "";
			startDate = null;
			endDate = null;
			description = "The date is not set!";
			urlAddress = null;
		}
		
		public ICalData(String title, Calendar startDate, Calendar endDate, String desc, URL address){
			this.title = title;
			this.startDate = startDate;
			this.endDate = endDate;
			this.description = desc;
			this.urlAddress = address;
		}
		
		// settery 
		public String getTitle() { return this.title; }
		public SimpleDateFormat getDateFormat() { return this.dateFormat; }
		public Calendar getStartDate() { return this.startDate; }
		public Calendar getEndDate() { return this.endDate; }
		public String getDescription() { return this.description; }
		public String getLocation() { return this.location; }
		public URL getUrlAddress() { return this.urlAddress; }
	}
	
	private ICalData iCalData;
	
	public ICalEvent(){ iCalData = new ICalData(); }
	public ICalEvent(String title, Calendar startDate, Calendar endDate, String desc, URL address){
		iCalData = new ICalData(title, startDate, endDate, desc, address);
	}
}

package javaProject.iCal;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ICalEvent {
	
	private class ICalData{
		
		private String title;
		private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");;
		private Calendar startDate;
		private Calendar endDate;
		private String description;
		private URL urlAddress;
		
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
	}
	
	private ICalData iCalData;
	
	public ICalEvent(){ iCalData = new ICalData(); }
	public ICalEvent(String title, Calendar startDate, Calendar endDate, String desc, URL address){
		iCalData = new ICalData(title, startDate, endDate, desc, address);
	}
}

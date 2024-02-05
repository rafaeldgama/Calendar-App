package reminders;

import java.time.DayOfWeek;

import enums.Reminder;

public class WeekDayReminder extends OrdinaryReminder {
	
	private DayOfWeek weekDay;
	
	public WeekDayReminder() {
		
	}
	
	public WeekDayReminder(String description, Reminder type, DayOfWeek weekDay) {
		super(description, type);
		this.weekDay = weekDay;
	}
	
	@Override
	public DayOfWeek getDayOfWeek() {
		return weekDay;
	}
	
}

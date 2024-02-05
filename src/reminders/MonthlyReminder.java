package reminders;

import java.time.Month;

import enums.Reminder;

public class MonthlyReminder extends OrdinaryReminder {
	
	private Month month;
	
	public MonthlyReminder() {
		
	}
	
	public MonthlyReminder(String description, Month month, Reminder type) {
		super(description, type);
		this.month = month;
	}

	@Override
	public Month getMonth() {
		return month;
	}
	
}

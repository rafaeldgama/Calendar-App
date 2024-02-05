package reminders;

import java.time.LocalDateTime;

import enums.Reminder;

public class Event extends OrdinaryReminder {

	private LocalDateTime date;
	
	public Event() {
		
	}
	
	public Event(String description, int month, int dayOfMonth, int year, int hour, int minute, Reminder type) {
		super(description, type);
		date = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
	}
	
	@Override
	public LocalDateTime getDate() {
		return date;
	}
	
	@Override
	protected Boolean sameDate(LocalDateTime anotherDate) {
		if(date.getYear() == anotherDate.getYear() && date.getMonthValue() == anotherDate.getMonthValue() && date.getDayOfMonth() == anotherDate.getDayOfMonth())
			return true;
		else
			return false;
	}

}

package reminders;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

import entities.Person;
import enums.Reminder;

public class OrdinaryReminder {

	private String description;
	private Reminder typeOfReminder;
	
	public OrdinaryReminder() {
		
	}
	
	public OrdinaryReminder(String description, Reminder type) {
		this.description = description;
		typeOfReminder = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Reminder getTypeOfReminder() {
		return typeOfReminder;
	}
	
	protected Month getMonth() {
		return null;
	}
	
	protected DayOfWeek getDayOfWeek() {
		return null;
	}
	
	protected LocalDateTime getDate() {
		return null;
	}
	
	protected Boolean sameDate(LocalDateTime anotherDate) {
		return null;
	}
	
	protected Boolean confirmAttendance(Person person) {
		return null;
	}
	
}

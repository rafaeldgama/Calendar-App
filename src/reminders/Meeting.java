package reminders;

import java.util.ArrayList;
import java.util.List;

import entities.Person;
import enums.Reminder;

public class Meeting extends Event {

	private List<Person> attendees = new ArrayList<Person>();
	
	public Meeting() {
		
	}
	
	public Meeting(String description, int month, int dayOfMonth, int year, int hour, int minute, Reminder type, List<Person> attendees) {
		super(description, month, dayOfMonth, year, hour, minute, type);
		this.attendees = attendees;
	}
	
	public void addPerson(Person p) {
		attendees.add(p);
	}
	
	public void removePerson(Person p) {
		attendees.remove(p);
	}
	
	@Override
	protected Boolean confirmAttendance(Person person) {
		int index = attendees.indexOf(person);
		if(index == -1) 
			return false;
		else if(person.getConfirmed())
			return true;
		else
			return false;
	}
	
}

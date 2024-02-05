package reminders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Person;
import enums.Reminder;

public class Schedule {
	
	private List<OrdinaryReminder> reminders = new ArrayList<OrdinaryReminder>();
	
	public Schedule() {
		
	}
	
	public void AddReminder(OrdinaryReminder reminder) {
		reminders.add(reminder);
	}

	public void cancelReminder(OrdinaryReminder reminder) {
		reminders.remove(reminder);
	}
	
	public void confirmAttendance(Meeting m, Person p) {
		int meetingIndex = reminders.indexOf(m);
		if(meetingIndex == -1)
			System.out.println("Meeting not scheduled.");
		else {
			if(reminders.get(meetingIndex).confirmAttendance(p))
				System.out.println("Attendance of " + p.getName() + " is confirmed.");
			else
				System.out.println("Attendance of " + p.getName() + " is not confirmed.");
		}
	}

	public void printCurrentReminders() {
		List<OrdinaryReminder> aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.ORDINARY_REMINDER).collect(Collectors.toList());
		System.out.println("Ordinary Reminders:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		LocalDateTime today = LocalDateTime.now();
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.WEEKDAY_REMINDER && x.getDayOfWeek() == today.getDayOfWeek()).collect(Collectors.toList());
		System.out.println("Reminders of " + today.getDayOfWeek().name() + ":");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.MONTHLY_REMINDER && x.getMonth() == today.getMonth()).collect(Collectors.toList());
		System.out.println("Reminders of this month:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.EVENT && x.sameDate(today) == true).collect(Collectors.toList());
		System.out.println("Events of today:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.MEETING && x.sameDate(today) == true).collect(Collectors.toList());
		System.out.println("Meetings of today:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
	}
	
	public void printSpecificDayReminders(LocalDateTime day) {
		List<OrdinaryReminder> aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.ORDINARY_REMINDER).collect(Collectors.toList());
		System.out.println("Ordinary Reminders:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.WEEKDAY_REMINDER && x.getDayOfWeek() == day.getDayOfWeek()).collect(Collectors.toList());
		System.out.println("Reminders of this day's" + day.getDayOfWeek().name() + ":");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.MONTHLY_REMINDER && x.getMonth() == day.getMonth()).collect(Collectors.toList());
		System.out.println("Reminders of this day's month:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.EVENT && x.sameDate(day) == true).collect(Collectors.toList());
		System.out.println("Events on the informed day:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
		aux = reminders.stream().filter(x -> x.getTypeOfReminder() == Reminder.MEETING && x.sameDate(day) == true).collect(Collectors.toList());
		System.out.println("Meetings on the informed day:");
		for(OrdinaryReminder reminder : aux) {
			System.out.println(reminder.getDescription());
		}
		System.out.println("===================");
	}
	
}

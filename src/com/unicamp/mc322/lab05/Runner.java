package com.unicamp.mc322.lab05;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import entities.Person;
import enums.Reminder;
import reminders.Event;
import reminders.Meeting;
import reminders.MonthlyReminder;
import reminders.OrdinaryReminder;
import reminders.Schedule;
import reminders.WeekDayReminder;

public class Runner {

	public static void main(String[] args) {
		
		Schedule scheduler = new Schedule();
		
		Person jack = new Person("Jack Byrnes", "jackbyrnes@gmail.com", "1234567-89");
		Person rose = new Person("Rose Smith", "rosesmith@gmail.com", "1234567-85");
		Person alex = new Person("Alex Green", "alexgreen@gmail.com", "1234567-87");
		
		Meeting production = new Meeting("We are going to discuss the new changes that are to be introduced in the production process"
				, 5, 02, 2021, 15, 30, Reminder.MEETING, new ArrayList<Person>(Arrays.asList(jack, alex)));
		
		scheduler.AddReminder(production);
		jack.setConfirmed(true);
		alex.setConfirmed(false);
		
		scheduler.confirmAttendance(production,jack);
		scheduler.confirmAttendance(production,alex);
		
		production.addPerson(rose);
		
		scheduler.confirmAttendance(production,rose);
		
		System.out.println("================================");
		
		OrdinaryReminder cutTheGrass = new OrdinaryReminder("Don't forget to cut the grass!", Reminder.ORDINARY_REMINDER);
		OrdinaryReminder walkDog = new OrdinaryReminder("Take the dog for a walk!", Reminder.ORDINARY_REMINDER);
		MonthlyReminder groceries = new MonthlyReminder("Go to the supermarket to buy some groceries", Month.MAY, Reminder.MONTHLY_REMINDER);
		Event gunsShow = new Event("Gun's n Roses show", 5, 02, 2021, 20, 30, Reminder.EVENT);
		WeekDayReminder mc322 = new WeekDayReminder("Don't forget to finish the lab", Reminder.WEEKDAY_REMINDER, DayOfWeek.SUNDAY);
		
		scheduler.AddReminder(cutTheGrass);
		scheduler.AddReminder(walkDog);
		scheduler.AddReminder(groceries);
		scheduler.AddReminder(gunsShow);
		scheduler.AddReminder(mc322);
		
		scheduler.printCurrentReminders();
	}

}

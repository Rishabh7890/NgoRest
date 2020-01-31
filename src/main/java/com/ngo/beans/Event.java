package com.ngo.beans;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document("event")
public class Event {


	private String id;
	private String eventName;
	private String startDate;
	private String duration;
	private String place;
	private List<Users> contrUsers;
	
	public Event() {
		
	}
	
	public Event(String id, String eventName, String startDate, String duration, String place, List<Users> contrUsers) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.startDate = startDate;
		this.duration = duration;
		this.place = place;
		this.contrUsers = contrUsers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public List<Users> getContrUsers() {
		return contrUsers;
	}

	public void setContrUsers(List<Users> contrUsers) {
		this.contrUsers = contrUsers;
	}
	
	
}

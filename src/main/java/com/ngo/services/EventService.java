package com.ngo.services;

import java.util.List;

import com.ngo.beans.Event;

public interface EventService {
	
	List<Event> findAll();

    Event findByEventName(String eventName);

    void saveOrUpdateEvent(Event event);

    void deleteEvent(String eventName);

}

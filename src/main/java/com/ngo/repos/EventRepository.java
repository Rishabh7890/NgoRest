package com.ngo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ngo.beans.Event;

public interface EventRepository extends MongoRepository<Event, String> {

	public Event findByEventName(String eventName);

}

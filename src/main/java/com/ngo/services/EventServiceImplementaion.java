package com.ngo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.beans.Event;
import com.ngo.repos.EventRepository;

	@Service
	public class EventServiceImplementaion implements EventService {

		@Autowired
		private EventRepository ev;

		@Override
		public List<Event> findAll() {
			return ev.findAll();
		}

		@Override
		public Event findByEventName(String eventName) {
			return ev.findByEventName(eventName);
		}

		@Override
		public void saveOrUpdateEvent(Event event) {
			ev.save(event);

		}

		@Override
		public void deleteEvent(String eventName) {
			ev.deleteByEventName(eventName);

		}
	}	

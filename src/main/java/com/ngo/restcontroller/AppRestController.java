package com.ngo.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngo.beans.Admin;
import com.ngo.beans.Event;
import com.ngo.beans.Users;
import com.ngo.services.AdminService;
import com.ngo.services.EventService;
import com.ngo.services.UserService;

@RestController
@RequestMapping("/")
public class AppRestController {

	@Autowired
	private UserService us;
	@Autowired
	private AdminService as;
	@Autowired
	private EventService es;

	// GET ALL USERS

	@GetMapping(value = "/users")
	public List<Users> getAllUsers() {
		return us.findAll();
	}

	// GET ALL ADMINS

	@GetMapping(value = "/admin")
	public List<Admin> getAllAdmins() {
		return as.findAll();
	}

	// GET ALL EVENTS

	@GetMapping(value = "/events")
	public List<Event> getAllEvents() {
		return es.findAll();
	}

	// GET A USER BASED ON EMAIL

	@GetMapping(value = "/users/{userEmail}")
	public Users getUserByUserEmail(@PathVariable("userEmail") String userEmail) {
		return us.findByUserEmail(userEmail);
	}

	// GET A ADMIN BASED ON EMAIL

	@GetMapping(value = "/admin/{adminEmail}")
	public Admin getAdminByAdminEmail(@PathVariable("adminEmail") String adminEmail) {
		return as.findByAdminEmail(adminEmail);
	}

	// GET AN EVENT BASED ON NAME

	@GetMapping(value = "/events/{eventName}")
	public Event getEventByEventName(@PathVariable("eventName") String eventName) {
		return es.findByEventName(eventName);
	}

	// POST A USER

	@PostMapping(value = "/users")
	public ResponseEntity saveOrUpdateUsers(@RequestBody Users user) {
		us.saveOrUpdateUsers(user);
		return new ResponseEntity("User added successfully", HttpStatus.OK);
	}

	// POST A ADMIN

	@PostMapping(value = "/admin")
	public ResponseEntity saveOrUpdateAdmin(@RequestBody Admin admin) {
		as.saveOrUpdateAdmin(admin);
		return new ResponseEntity("Admin added successfully", HttpStatus.OK);
	}

	// POST A EVENT

	@PostMapping(value = "/events")
	public ResponseEntity saveOrUpdateEvent(@RequestBody Event event) {
		es.saveOrUpdateEvent(event);
		return new ResponseEntity("Event added successfully", HttpStatus.OK);
	}

	// delete user

	@DeleteMapping(value = "/{userEmail}")
	public void deleteUser(@PathVariable String userEmail) {
		us.deleteUsers(us.findByUserEmail(userEmail).getId());
	}

	// delete Admin

	@DeleteMapping(value = "/{adminEmail}")
	public void deleteAdmin(@PathVariable String adminEmail) {
		as.deleteAdmin(as.findByAdminEmail(adminEmail).getId());
	}

	// delete Event

	@DeleteMapping(value = "/{eventName}")
	// update user
	
	@PutMapping(value= "/users/update/{userEmail}")
    public String update(@PathVariable(value= "userEmail") String userEmail, @RequestBody Users u) {
    //u.setUserEmail(userEmail);
    us.saveOrUpdateUsers(u);
    return "User record for employee-id= " + userEmail + " updated.";
    }
	
	// update admin
	
	@PutMapping(value= "/admin/update/{adminEmail}")
	public String update(@PathVariable(value= "adminEmail") String adminEmail, @RequestBody Admin a) {
	//a.setAdminEmail(adminEmail);
	as.saveOrUpdateAdmin(a);
	return "Admin record for adminEmail= " + adminEmail + " updated.";
	}
	
	// update event
	
	@PutMapping(value= "/events/update/{eventName}")
	public String update(@PathVariable(value= "eventName") String eventName, @RequestBody Event e) {
	//e.setEventName(eventName);
	es.saveOrUpdateEvent(e);
	return "Event record for eventName= " + eventName + " updated.";
	}

}

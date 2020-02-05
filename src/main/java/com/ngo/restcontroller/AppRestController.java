package com.ngo.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngo.beans.Admin;
import com.ngo.beans.Donation;
import com.ngo.beans.Event;
import com.ngo.beans.Users;
import com.ngo.services.AdminService;
import com.ngo.services.DonationService;
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
	@Autowired
	private DonationService ds;

	// GET ALL USERS

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/users")
	public List<Users> getAllUsers() {
		return us.findAll();
	}

	// GET ALL ADMINS

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/admin")
	public List<Admin> getAllAdmins() {
		return as.findAll();
	}

	// GET ALL EVENTS

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/events")
	public List<Event> getAllEvents() {
		return es.findAll();
	}

	// GET ALL DONATIONS

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/donations")
	public List<Donation> getAllDonations() {
		return ds.findAll();
	}

	// GET USER CART CONTAINING DONATIONS

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/users/{screenName}/cart")
	public List<Donation> getCart(@PathVariable("screenName") String screenName) {
		return us.findByScreenName(screenName).getCart();
	}

	// GET A USER BASED ON EMAIL

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/users/{screenName}")
	public Users getUserByScreenName(@PathVariable("screenName") String screenName) {
		return us.findByScreenName(screenName);
	}

	// GET A ADMIN BASED ON EMAIL

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/admin/{adminEmail}")
	public Admin getAdminByAdminEmail(@PathVariable("adminEmail") String adminEmail) {
		return as.findByAdminEmail(adminEmail);
	}

	// GET AN EVENT BASED ON NAME

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/events/{eventName}")
	public Event getEventByEventName(@PathVariable("eventName") String eventName) {
		return es.findByEventName(eventName);
	}

	// GET A DONATION BASED ON TYPE

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/donations/{donationType}")
	public Donation getEventByDonationType(@PathVariable("donationType") String donationType) {
		return ds.findByDonationType(donationType);
	}

	// GET A DONATION BASED ON REF EMAIL

	@CrossOrigin("http://127.0.0.1:3000")
	@GetMapping(value = "/donations/{donationRefEmail}")
	public Donation getEventByDonationRefEmail(@PathVariable("donationRefEmail") String donationRefEmail) {
		return ds.findByDonationRefEmail(donationRefEmail);
	}

	// POST A USER

	@CrossOrigin("http://127.0.0.1:3000")
	@PostMapping(value = "/users")
	public ResponseEntity<String> saveOrUpdateUsers(@RequestBody Users user) {
		us.saveOrUpdateUsers(user);
		return new ResponseEntity<String>("User added successfully", HttpStatus.OK);
	}

	// POST A ADMIN

	@CrossOrigin("http://127.0.0.1:3000")
	@PostMapping(value = "/admin")
	public ResponseEntity<String> saveOrUpdateAdmin(@RequestBody Admin admin) {
		as.saveOrUpdateAdmin(admin);
		return new ResponseEntity<String>("Admin added successfully", HttpStatus.OK);
	}

	// POST A EVENT

	@CrossOrigin("http://127.0.0.1:3000")
	@PostMapping(value = "/events")
	public ResponseEntity<String> saveOrUpdateEvent(@RequestBody Event event) {
		es.saveOrUpdateEvent(event);
		return new ResponseEntity<String>("Event added successfully", HttpStatus.OK);
	}

	// POST A DONATION

	@CrossOrigin("http://127.0.0.1:3000")
	@PostMapping(value = "/donations")
	public ResponseEntity<String> saveOrUpdateDonation(@RequestBody Donation donation) {
		ds.saveOrUpdateDonation(donation);
		return new ResponseEntity<String>("Donation added successfully", HttpStatus.OK);
	}

	// delete user

	@CrossOrigin("http://127.0.0.1:3000")
	@DeleteMapping(value = "/users/delete/{screenName}")
	public void deleteUser(@PathVariable String screenName) {
		us.deleteUser(us.findByScreenName(screenName).getScreenName());
	}

	// delete Admin

	@CrossOrigin("http://127.0.0.1:3000")
	@DeleteMapping(value = "/admin/delete/{adminEmail}")
	public void deleteAdmin(@PathVariable String adminEmail) {
		as.deleteAdmin(as.findByAdminEmail(adminEmail).getAdminEmail());
	}

	// delete Event

	@CrossOrigin("http://127.0.0.1:3000")
	@DeleteMapping(value = "/events/delete/{eventName}")
	public void deleteEvent(@PathVariable String eventName) {
		es.deleteEvent(es.findByEventName(eventName).getEventName());
	}

	// delete Donation

	@CrossOrigin("http://127.0.0.1:3000")
	@DeleteMapping(value = "/donations/delete/{donationId}")
	public void deleteDonation(@PathVariable String donationId) {
		ds.deleteDonation(ds.findByDonationId(donationId).getDonationId());
	}

	// update user

	@CrossOrigin("http://127.0.0.1:3000")
	@PutMapping(value = "/users/update/{userEmail}")
	public String update(@PathVariable(value = "userEmail") String userEmail, @RequestBody Users u) {
		us.saveOrUpdateUsers(u);
		return "User record for employee-id= " + userEmail + " updated.";
	}

	// update admin

	@CrossOrigin("http://127.0.0.1:3000")
	@PutMapping(value = "/admin/update/{adminEmail}")
	public String update(@PathVariable(value = "adminEmail") String adminEmail, @RequestBody Admin a) {
		as.saveOrUpdateAdmin(a);
		return "Admin record for adminEmail= " + adminEmail + " updated.";
	}

	// update event

	@CrossOrigin("http://127.0.0.1:3000")
	@PutMapping(value = "/events/update/{eventName}")
	public String update(@PathVariable(value = "eventName") String eventName, @RequestBody Event e) {
		es.saveOrUpdateEvent(e);
		return "Event record for eventName= " + eventName + " updated.";
	}

}

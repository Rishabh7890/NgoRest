package com.ngo.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("donation")
public class Donation {

	@Id
	private String donationId;
	private String donationType;
	private String donationAmount;

	public Donation() {

	}

	public Donation(String id, String donationType, String donationAmount) {
		this.donationId = id;
		this.donationType = donationType;
		this.donationAmount = donationAmount;

	}

	public String getId() {
		return donationId;
	}

	public void setId(String donationId) {
		this.donationId = donationId;
	}

	public String getDonationType() {
		return donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public String getDonationAmount() {
		return donationAmount;
	}

	public void setDonationAmount(String donationAmount) {
		this.donationAmount = donationAmount;
	}
}

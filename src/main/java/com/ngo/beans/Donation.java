package com.ngo.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("donation")
public class Donation {

	@Id
	private String donationId;
	private String donationType;
	private String donationAmount;
	private String donationRefEmail;

	public Donation() {

	}

	public Donation(String donationId, String donationType, String donationAmount, String donationRefEmail) {
		this.donationId = donationId;
		this.donationType = donationType;
		this.donationAmount = donationAmount;
		this.donationRefEmail = donationRefEmail;

	}

	public String getDonationId() {
		return donationId;
	}

	public void setDonationId(String donationId) {
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

	public String getDonationRefEmail() {
		return donationRefEmail;
	}

	public void setDonationRefEmail(String donationRefEmail) {
		this.donationRefEmail = donationRefEmail;
	}
}

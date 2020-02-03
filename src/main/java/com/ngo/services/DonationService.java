package com.ngo.services;

import java.util.List;

import com.ngo.beans.Donation;

public interface DonationService {

	List<Donation> findAll();

	Donation findByDonationType(String donationType);

	Donation findByDonationId(String donationId);

	Donation findByDonationRefEmail(String donationRefEmail);

	void saveOrUpdateDonation(Donation donation);

	void deleteDonation(String donationId);

}

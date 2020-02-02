package com.ngo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ngo.beans.Donation;

public interface DonationRepository extends MongoRepository<Donation, String> {

	public Donation findByDonationType(String donationType);

	public Donation findByDonationId(String donationId);

	public void deleteByDonationId(String donationId);

}

package com.ngo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.beans.Donation;
import com.ngo.repos.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService {

	@Autowired
	private DonationRepository dr;

	@Override
	public List<Donation> findAll() {
		return dr.findAll();
	}

	@Override
	public Donation findByDonationType(String donationType) {
		return dr.findByDonationType(donationType);
	}

	@Override
	public Donation findByDonationId(String donationId) {
		return dr.findByDonationId(donationId);
	}

	@Override
	public void saveOrUpdateDonation(Donation donation) {
		dr.save(donation);

	}

	@Override
	public void deleteDonation(String donationId) {
		dr.deleteByDonationId(donationId);

	}

}
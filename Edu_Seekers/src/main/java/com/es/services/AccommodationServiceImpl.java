package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.dao.AccommodationRepository;
import com.es.entity.Accommodation;

@Service
public class AccommodationServiceImpl implements AccommodationService {
	
	@Autowired
	private AccommodationRepository accommodationRepository;
	

	public AccommodationServiceImpl(AccommodationRepository accommodationRepository) {
		super();
		this.accommodationRepository = accommodationRepository;
	}

	@Override
	public List<Accommodation> getAllAccommodation() {
	
		return accommodationRepository.findAll();
	}

	@Override
	public Accommodation addAccommodation(Accommodation accommodation) {
		 accommodationRepository.save( accommodation);
		return  accommodation;
	}

	@Override
	public Accommodation getAccommodation(long accommodationId) {
	
		return  accommodationRepository.getOne( accommodationId);
	}

	@Override
	public void deleteAccommodation(long parseLong) {
	Accommodation entity =  accommodationRepository.getOne(parseLong);
	 accommodationRepository.delete(entity);
	}

	
}

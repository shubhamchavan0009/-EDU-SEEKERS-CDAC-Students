package com.es.services;

import java.util.List;

import com.es.entity.Accommodation;
import com.es.entity.Hospital;

public interface AccommodationService {
	
public List<Accommodation> getAllAccommodation();

	
	public Accommodation addAccommodation(Accommodation accommodation);
	
	public Accommodation getAccommodation(long accommodationId);
	
	public void deleteAccommodation(long  parseLong);
	

}

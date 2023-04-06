package com.es.services;

import java.util.List;

import com.es.entity.Hospital;

public interface HospitalService {
	
	public List<Hospital> getAllHospital();
	
	//public Hospital getHospitalById(long id);
	
	public Hospital addHospitals(Hospital hospital);
	
	public Hospital getHospitals(long hospitalId);
	
	public void deleteHospital(long  parseLong);
	
	
}

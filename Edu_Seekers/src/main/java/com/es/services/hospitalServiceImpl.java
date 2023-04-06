package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.dao.HospitalRepository;

import com.es.entity.Hospital;

import com.es.services.HospitalService;

@Service
public class hospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository hospitalRepository; 
	
	public hospitalServiceImpl(List<Hospital> list) {
		super();	
	}

	// to show data  on frontend
	@Override
	public List<Hospital> getAllHospital() {
		
		return hospitalRepository.findAll();
	}
	
	@Override
	public Hospital getHospitals(long hospitalId) {
		return hospitalRepository.getOne(hospitalId);
    }
	// adding hospitals to database
	
		@Override
		public Hospital addHospitals(Hospital hospital) {
			hospitalRepository.save(hospital);
			return hospital;
		}

		@Override
		public void deleteHospital(long parseLong) {
			Hospital entity = hospitalRepository.getOne(parseLong);
			hospitalRepository.delete(entity);
		}

		
		
//		@Override
//		public Hospital getHospitalById(Long id) {
//			
//			return hospitalRepository.findById(id).get();
//		}

		
		
		
		
		
		
		
		
		
		
		
		

	

	



	

	

	

}


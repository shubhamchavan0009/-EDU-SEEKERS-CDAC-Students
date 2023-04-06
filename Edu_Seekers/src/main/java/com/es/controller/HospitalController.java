package com.es.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.entity.Course;
import com.es.entity.Hospital;

import com.es.services.HospitalService;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class HospitalController {
	
	private HospitalService hospitalService;
	//Generate Constructor

	public HospitalController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	
	// adding hospital to database
	@PostMapping("/hospitals")
	public Hospital addHospitals(@RequestBody Hospital hospital) {
		return this.hospitalService.addHospitals(hospital);
	}
	
	
	@GetMapping("/hospitals/{hospitalId}")
	public Hospital getHospitals(@PathVariable String hospitalId) {
		return this.hospitalService.getHospitals(Long.parseLong(hospitalId));
	}
	
	   //get all hospitals
		@GetMapping("/hospitals")
		public List<Hospital> getAllHospital(){
			return this.hospitalService.getAllHospital();
		}
	
		
		@DeleteMapping("/hospitals/{hospitalId}")
		public ResponseEntity<HttpStatus> deleteHospital(@PathVariable String hospitalId){
			try {
				this.hospitalService.deleteHospital(Long.parseLong(hospitalId));
				    return new ResponseEntity<>(HttpStatus.OK);
				}catch(Exception e) {
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
		}
	
//		
//		@GetMapping("/hospitals/{hospitalsId}")
//		public Hospital getHospital(@PathVariable String hospitalsId) {
//			return this.hospitalService.getHospitals(Long.parseLong(hospitalsId));
//		}
	 
	
}

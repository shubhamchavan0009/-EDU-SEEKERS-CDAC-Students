package com.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.entity.Accommodation;
import com.es.services.AccommodationService;


@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class AccommodationController {
	
@Autowired	
private AccommodationService accommodationService;
	
	
	public AccommodationController() {
		super();
		this.accommodationService=accommodationService;
	}

	// adding hospital to database
		@PostMapping("/accommodation")
		public Accommodation addAccommodation(@RequestBody Accommodation accommodation) {
			return this.accommodationService.addAccommodation(accommodation);
		}
		
		
		@GetMapping("/accommodation/{accommodationId}")
		public Accommodation getAccommodation(@PathVariable String accommodationId) {
			return this.accommodationService.getAccommodation(Long.parseLong(accommodationId));
		}
		
		   //get all hospitals
			@GetMapping("/accommodation")
			public List<Accommodation> getAllAccommodation(){
				return this.accommodationService.getAllAccommodation();
			}
		
			
			@DeleteMapping("/accommodation/{accommodationId}")
			public ResponseEntity<HttpStatus> deleteAccommodation(@PathVariable String accommodationId){
				try {
					this.accommodationService.deleteAccommodation(Long.parseLong(accommodationId));
					    return new ResponseEntity<>(HttpStatus.OK);
					}catch(Exception e) {
						return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
					}
			}
	
	

}

package com.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.es.entity.Hospital;
import com.es.entity.Mess;
import com.es.services.MessServices;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class MessController {
	
	@Autowired
	private MessServices messServices;
	
	
	
//	public MessController() {
//		super();
//	}



	public MessController(MessServices messServices) {
		super();
		this.messServices = messServices;
	}


	
	// adding hospital to database
		@PostMapping("/mess")
		public Mess addMess(@RequestBody Mess mess) {
			return this.messServices.addMess(mess);
		}
		
		
		@GetMapping("/mess/{messId}")
		public Mess getMess(@PathVariable String messId) {
			return this.messServices.getMess(Long.parseLong(messId));
		}
		
		   //get all hospitals
			@GetMapping("/mess")
			public List<Mess> getAllMess(){
				return this.messServices.getAllMess();
			}
		
			
			@DeleteMapping("/mess/{messId}")
			public ResponseEntity<HttpStatus> deleteMess(@PathVariable String messId){
				try {
					this.messServices.deleteMess(Long.parseLong(messId));
					    return new ResponseEntity<>(HttpStatus.OK);
					}catch(Exception e) {
						return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
					}
			}
	

}

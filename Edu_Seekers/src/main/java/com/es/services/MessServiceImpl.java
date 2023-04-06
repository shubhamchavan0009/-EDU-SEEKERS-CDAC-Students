package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.entity.Mess;
import com.es.dao.MessRepository;
import com.es.services.MessServices;

@Service
public class MessServiceImpl implements MessServices {
	
	@Autowired
	private MessRepository messRepository; 
	

	public MessServiceImpl(MessRepository messRepository) {
		super();
		this.messRepository = messRepository;
	}

	@Override
	public List<Mess> getAllMess() {
		// TODO Auto-generated method stub
		return messRepository.findAll();
	}
	
	@Override
	public Mess addMess(Mess mess) {
		messRepository.save(mess);
		return mess;
	}

	@Override
	public Mess getMess(long messId) {
		
		return messRepository.getOne(messId);
	}

	@Override
	public void deleteMess(long parseLong) {
		Mess entity = messRepository.getById(parseLong);
		messRepository.delete(entity);
		
	}
	
	
}

package com.es.services;

import java.util.List;

import com.es.entity.Mess;

public interface MessServices {

	
    public List<Mess> getAllMess();
		
	public Mess addMess(Mess mess);
	
	public Mess getMess(long messId);
	
	public void deleteMess(long  parseLong);
	
}

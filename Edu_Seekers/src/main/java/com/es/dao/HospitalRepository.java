package com.es.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}

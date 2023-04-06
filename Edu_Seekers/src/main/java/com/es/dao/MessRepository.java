package com.es.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.entity.Mess;



public interface MessRepository extends JpaRepository<Mess, Long>{

}

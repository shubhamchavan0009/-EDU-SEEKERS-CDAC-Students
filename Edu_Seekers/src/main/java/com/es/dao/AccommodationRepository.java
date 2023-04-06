package com.es.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.entity.Accommodation;


public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {

}

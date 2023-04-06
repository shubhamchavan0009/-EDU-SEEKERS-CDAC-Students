package com.es.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.es.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}

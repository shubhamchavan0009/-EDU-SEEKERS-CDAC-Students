package com.es.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.es.dao.CourseDao;
import com.es.entity.Course;

@Service
public class courseServiceImpl implements courseService {
	
	@Autowired
	private CourseDao courseDao;
	
	  //List<Course> list;	
	public courseServiceImpl(List<Course> list) {
		super();
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course :list) {
//			if(course.getId() == courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
	  Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	
	

}

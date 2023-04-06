package com.es.controller;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.util.StreamUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.hibernate.*;

import com.es.dao.CourseDao;
import com.es.entity.Course;
import com.es.services.FileService;
import com.es.services.courseService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class MyController {
	
	@Autowired
	private courseService courseservice;
	
	@Autowired
	private FileService fileService;
	
	@Value("${project.image}")
	private String path;
	
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	//get all courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
 
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseservice.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseservice.updateCourse(course);
	}
	
	
	// uploading image
	@PostMapping("/upload/{courseId}")
	public ResponseEntity<Course> uploadPostImage(@RequestParam("immage") MultipartFile immage, @PathVariable Integer courseId) throws IOException{
		Course course= this.courseservice.getCourse(courseId);
		String fileName=this.fileService.uploadImage(path, immage);
		course.setImmage(fileName);
		Course updateCourse=this.courseservice.updateCourse(course);
		return new  ResponseEntity<Course>(updateCourse,HttpStatus.OK);
	}
	
	// method to serve file
	@GetMapping(value = "/{immage}",produces = org.springframework.http.MediaType.IMAGE_JPEG_VALUE)
	public void downloadImage(@PathVariable("immage") String immage, HttpServletResponse response)throws IOException {
		InputStream resourse=this.fileService.getResourse(path, immage);
		response.setContentType(org.springframework.http.MediaType.IMAGE_JPEG_VALUE);
		org.springframework.util.StreamUtils.copy(resourse, response.getOutputStream());
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseservice.deleteCourse(Long.parseLong(courseId));
			    return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
}

package com.demo.controller;

import com.demo.entity.CourseEntity;
import com.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    // Add course to the course catalogue.
    @PostMapping("/api/courses")
    public CourseEntity createCourse(@RequestBody CourseEntity courseEntity){
        CourseEntity savedCourseEntity = courseRepository.save(courseEntity);
        return savedCourseEntity;
    }

    // Display the details of all courses
    @GetMapping("/api/courses")
    public List<CourseEntity> getEmployeeEntityList() {
        List<CourseEntity> courseEntityList = courseRepository.findAll();
        return courseEntityList;
    }

    // Delete courses from the course catalogue
    @DeleteMapping("/api/courses/{id}")
    public CourseEntity deleteCourse(@PathVariable(value="id") Integer courseId) {
        CourseEntity deletedCourseEntity = courseRepository.findById(courseId).get();
        courseRepository.delete(deletedCourseEntity);
        return deletedCourseEntity;
    }

    // Update courses from the course catalogue
    @PutMapping("api/courses/{id]")
    public  CourseEntity updateCourse(@PathVariable(value="id") Integer courseId, @RequestBody CourseEntity courseEntity ){
        Optional<CourseEntity> optionalCourseEntity = courseRepository.findById(courseId);
        CourseEntity existingCourseEntity = null;
        if (optionalCourseEntity.isPresent()){
            existingCourseEntity = optionalCourseEntity.get();
        }
        existingCourseEntity.setCourseName(courseEntity.getCourseName());
        existingCourseEntity.setAuthorName(courseEntity.getAuthorName());
        existingCourseEntity.setDuration(courseEntity.getDuration());
        existingCourseEntity.setAvailability(courseEntity.isAvailability());
        CourseEntity updatedCourseEntity = courseRepository.save(existingCourseEntity);
        return updatedCourseEntity;
    }



}

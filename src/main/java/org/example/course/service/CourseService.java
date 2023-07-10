package org.example.course.service;

import org.example.course.mapper.CourseMapper;
import org.example.course.model.Course;

import java.util.List;

public class CourseService {
    private final CourseMapper courseMapper;

    public CourseService(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public Course getCourseById(int courseId) {
        return courseMapper.getCourseById(courseId);
    }

    public void insertCourse(Course course) {
        courseMapper.insertCourse(course);
    }

    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseMapper.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseMapper.getAllCourses();
    }
}

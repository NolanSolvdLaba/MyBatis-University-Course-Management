package org.example.course.mapper;

import org.apache.ibatis.annotations.*;
import org.example.course.model.Course;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM course WHERE course_id = #{courseId}")
    Course getCourseById(int courseId);

    @Insert("INSERT INTO course (course_name, credits, semester_id, instructor_id, department_id, classroom_id, description) " +
            "VALUES (#{courseName}, #{credits}, #{semesterId}, #{instructorId}, #{departmentId}, #{classroomId}, #{description})")
    @Options(useGeneratedKeys = true, keyProperty = "courseId")
    void insertCourse(Course course);

    @Update("UPDATE course SET course_name = #{courseName}, credits = #{credits}, semester_id = #{semesterId}, " +
            "instructor_id = #{instructorId}, department_id = #{departmentId}, classroom_id = #{classroomId}, " +
            "description = #{description} WHERE course_id = #{courseId}")
    void updateCourse(Course course);

    @Delete("DELETE FROM course WHERE course_id = #{courseId}")
    void deleteCourse(int courseId);

    @Select("SELECT * FROM course")
    List<Course> getAllCourses();
}

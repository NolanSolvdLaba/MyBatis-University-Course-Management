package org.example;

import org.example.instructor.mapper.InstructorMapper;
import org.example.instructor.model.Instructor;
import org.example.instructor.service.InstructorService;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new course
        Instructor instructor = new Instructor("Bruce Wilshire");

        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Get the Service instance
            InstructorService instructorService = new InstructorService(sqlSession.getMapper(InstructorMapper.class));

            // Insert
            instructorService.insertInstructor(instructor);

            // Commit the transaction
            sqlSession.commit();

            // Display success message
            System.out.println("Course inserted successfully!");

        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Failed to insert course: " + e.getMessage());
            sqlSession.rollback();
        } finally {
            // Close the MyBatis session
            sqlSession.close();
        }
    }
}

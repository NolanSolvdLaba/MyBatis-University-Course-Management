package org.example;

import org.example.instructor.mapper.InstructorMapper;
import org.example.instructor.model.Instructor;
import org.example.instructor.service.InstructorService;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        // Create a new instructor
        Instructor instructor = new Instructor();
        instructor.setInstructorName("John Smith");

        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Get the InstructorService instance
            InstructorService instructorService = new InstructorService(sqlSession.getMapper(InstructorMapper.class));

            // Insert the instructor
            instructorService.insertInstructor(instructor);

            // Commit the transaction
            sqlSession.commit();

            // Display success message
            System.out.println("Instructor inserted successfully!");
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Failed to insert instructor: " + e.getMessage());
            sqlSession.rollback();
        } finally {
            // Close the MyBatis session
            sqlSession.close();
        }
    }
}

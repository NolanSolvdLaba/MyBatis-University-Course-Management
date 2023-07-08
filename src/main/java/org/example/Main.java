package org.example;

import org.example.student.model.Student;
import org.example.student.service.StudentService;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student();
        student.setStudentName("John Doe");
        student.setAdmissionYear(2023);
        student.setDepartmentId(1);
        student.setDepartmentName("Computer Science");

        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Get the StudentService instance
            StudentService studentService = sqlSession.getMapper(StudentService.class);

            // Insert the student
            studentService.insertStudent(student);

            // Commit the transaction
            sqlSession.commit();

            // Display success message
            System.out.println("Student inserted successfully!");
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Failed to insert student: " + e.getMessage());
            sqlSession.rollback();
        } finally {
            // Close the MyBatis session
            sqlSession.close();
        }
    }
}

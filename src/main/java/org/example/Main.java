package org.example;

import org.example.student.mapper.StudentMapper;
import org.example.student.model.Student;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student();
        student.setStudentId(1017);

        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Get the StudentMapper instance
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            // Insert the student
            studentMapper.deleteStudent(student.getStudentId());

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

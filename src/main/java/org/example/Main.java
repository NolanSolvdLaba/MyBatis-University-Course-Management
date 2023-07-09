package org.example;

import org.example.departmentstudent.model.DepartmentStudent;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        // Create a new department
        DepartmentStudent departmentStudent = new DepartmentStudent();
        departmentStudent.getDepartmentStudentsByDepartmentId(1);

        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Get the DepartmentService instance
            DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

            // Insert the department
            departmentMapper.insertDepartment(department);

            // Commit the transaction
            sqlSession.commit();

            // Display success message
            System.out.println("Department inserted successfully!");
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Failed to insert department: " + e.getMessage());
            sqlSession.rollback();
        } finally {
            // Close the MyBatis session
            sqlSession.close();
        }
    }
}

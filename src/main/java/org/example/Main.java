package org.example;

import org.example.departmentstudent.mapper.DepartmentStudentMapper;
import org.example.departmentstudent.model.DepartmentStudent;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            DepartmentStudentMapper departmentStudentMapper = sqlSession.getMapper(DepartmentStudentMapper.class);

// Retrieve the department students
            List<DepartmentStudent> departmentStudents = departmentStudentMapper.getDepartmentStudentsByDepartmentId(2);

// Print the department students
            for (DepartmentStudent departmentStudent : departmentStudents) {
                System.out.println(departmentStudent);
            }

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

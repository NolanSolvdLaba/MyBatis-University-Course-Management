package org.example;

import org.example.department.model.Department;
import org.example.course.model.Course;
import org.example.join.model.JoinResult;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Open a MyBatis session
        SqlSession sqlSession = MyBatisUtil.openSession();

        try {
            // Retrieve the join results
            List<JoinResult> joinResults = sqlSession.selectList("org.example.mapper.JoinMapper.performLeftJoin");

            // Print the join results
            for (JoinResult joinResult : joinResults) {
                Department department = joinResult.getDepartment();
                Course course = joinResult.getCourse();

                System.out.println("Department ID: " + department.getDepartmentId());
                System.out.println("Department Name: " + department.getDepartmentName());
                System.out.println("Course ID: " + course.getCourseId());
                System.out.println("Course Name: " + course.getCourseName());
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Failed to perform left join: " + e.getMessage());
        } finally {
            // Close the MyBatis session
            sqlSession.close();
        }
    }
}

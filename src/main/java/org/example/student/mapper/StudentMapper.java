package org.example.student.mapper;

import org.example.student.model.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE student_id = #{studentId}")
    Student getStudentById(int studentId);

    @Insert("INSERT INTO student (student_name, admission_year, department_id, department_name) " +
            "VALUES (#{studentName}, #{admissionYear}, #{departmentId}, #{departmentName})")
    @Options(useGeneratedKeys = true, keyProperty = "studentId")
    void insertStudent(Student student);

    @Update("UPDATE student SET student_name = #{studentName}, admission_year = #{admissionYear}, " +
            "department_id = #{departmentId}, department_name = #{departmentName} " +
            "WHERE student_id = #{studentId}")
    void updateStudent(Student student);

    @Delete("DELETE FROM student WHERE student_id = #{studentId}")
    void deleteStudent(int studentId);
}

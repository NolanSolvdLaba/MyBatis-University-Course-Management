package org.example.departmentstudent.mapper;

import org.apache.ibatis.annotations.*;
import org.example.departmentstudent.model.DepartmentStudent;

import java.util.List;

@Mapper
public interface DepartmentStudentMapper {
    @Select("SELECT * FROM departmentstudent")
    List<DepartmentStudent> getAllDepartmentStudents();

    @Select("SELECT * FROM departmentstudent WHERE department_id = #{departmentId}")
    List<DepartmentStudent> getDepartmentStudentsByDepartmentId(int departmentId);

    @Select("SELECT * FROM departmentstudent WHERE student_id = #{studentId}")
    List<DepartmentStudent> getDepartmentStudentsByStudentId(int studentId);

    @Delete("DELETE FROM departmentstudent WHERE department_id = #{departmentId} AND student_id = #{studentId}")
    void deleteDepartmentStudent(@Param("departmentId") int departmentId, @Param("studentId") int studentId);
}

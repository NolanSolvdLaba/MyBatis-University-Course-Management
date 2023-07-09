package org.example.department.mapper;

import org.apache.ibatis.annotations.*;
import org.example.department.model.Department;

@Mapper
public interface DepartmentMapper {
    @Select("SELECT * FROM department WHERE department_id = #{departmentId}")
    Department getDepartmentById(int departmentId);

    @Insert("INSERT INTO department (department_name) VALUES (#{departmentName})")
    @Options(useGeneratedKeys = true, keyProperty = "departmentId")
    void insertDepartment(Department department);

    @Update("UPDATE department SET department_name = #{departmentName} WHERE department_id = #{departmentId}")
    void updateDepartment(Department department);

    @Delete("DELETE FROM department WHERE department_id = #{departmentId}")
    void deleteDepartment(int departmentId);
}

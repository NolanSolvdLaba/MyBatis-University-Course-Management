package org.example.department.service;

import org.example.department.mapper.DepartmentMapper;
import org.example.department.model.Department;

public class DepartmentService {
    private final DepartmentMapper departmentMapper;

    public DepartmentService(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public Department getDepartmentById(int departmentId) {
        return departmentMapper.getDepartmentById(departmentId);
    }

    public void insertDepartment(Department department) {
        departmentMapper.insertDepartment(department);
    }

    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }

    public void deleteDepartment(int departmentId) {
        departmentMapper.deleteDepartment(departmentId);
    }
}

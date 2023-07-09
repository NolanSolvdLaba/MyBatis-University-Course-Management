package org.example.departmentstudent.service;

import org.example.departmentstudent.mapper.DepartmentStudentMapper;
import org.example.departmentstudent.model.DepartmentStudent;

import java.util.List;

public class DepartmentStudentService {
    private final DepartmentStudentMapper departmentStudentMapper;

    public DepartmentStudentService(DepartmentStudentMapper departmentStudentMapper) {
        this.departmentStudentMapper = departmentStudentMapper;
    }

    public List<DepartmentStudent> getAllDepartmentStudents() {
        return departmentStudentMapper.getAllDepartmentStudents();
    }

    public List<DepartmentStudent> getDepartmentStudentsByDepartmentId(int departmentId) {
        return departmentStudentMapper.getDepartmentStudentsByDepartmentId(departmentId);
    }

    public List<DepartmentStudent> getDepartmentStudentsByStudentId(int studentId) {
        return departmentStudentMapper.getDepartmentStudentsByStudentId(studentId);
    }

    public void deleteDepartmentStudent(int departmentId, int studentId) {
        departmentStudentMapper.deleteDepartmentStudent(departmentId, studentId);
    }
}

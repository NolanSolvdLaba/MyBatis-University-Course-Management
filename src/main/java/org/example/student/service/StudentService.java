package org.example.student.service;

import org.example.student.mapper.StudentMapper;
import org.example.student.model.Student;

public class StudentService {
    private final StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getStudentById(int studentId) {
        return studentMapper.getStudentById(studentId);
    }

    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    public void deleteStudent(int studentId) {
        studentMapper.deleteStudent(studentId);
    }

}

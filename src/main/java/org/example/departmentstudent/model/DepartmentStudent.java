package org.example.departmentstudent.model;

public class    DepartmentStudent {
    private int departmentId;
    private int studentId;

    public DepartmentStudent() {
    }

    public DepartmentStudent(int departmentId, int studentId) {
        this.departmentId = departmentId;
        this.studentId = studentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

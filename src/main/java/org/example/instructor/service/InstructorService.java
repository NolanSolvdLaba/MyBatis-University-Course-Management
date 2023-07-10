package org.example.instructor.service;

import org.example.instructor.mapper.InstructorMapper;
import org.example.instructor.model.Instructor;

public class InstructorService {
    private final InstructorMapper instructorMapper;

    public InstructorService(InstructorMapper instructorMapper) {
        this.instructorMapper = instructorMapper;
    }

    public Instructor getInstructorById(int instructorId) {
        return instructorMapper.getInstructorById(instructorId);
    }

    public void insertInstructor(Instructor instructor) {
        instructorMapper.insertInstructor(instructor);
    }

    public void updateInstructor(Instructor instructor) {
        instructorMapper.updateInstructor(instructor);
    }

    public void deleteInstructor(int instructorId) {
        instructorMapper.deleteInstructor(instructorId);
    }
}

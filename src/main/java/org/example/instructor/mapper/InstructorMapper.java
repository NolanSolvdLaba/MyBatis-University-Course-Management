package org.example.instructor.mapper;

import org.apache.ibatis.annotations.*;
import org.example.instructor.model.Instructor;

@Mapper
public interface InstructorMapper {

    @Select("SELECT * FROM instructor WHERE instructor_id = #{instructorId}")
    Instructor getInstructorById(int instructorId);

    @Insert("INSERT INTO instructor (instructor_name) VALUES (#{instructorName})")
    @Options(useGeneratedKeys = true, keyProperty = "instructorId")
    void insertInstructor(Instructor instructor);

    @Update("UPDATE instructor SET instructor_name = #{instructorName} WHERE instructor_id = #{instructorId}")
    void updateInstructor(Instructor instructor);

    @Delete("DELETE FROM instructor WHERE instructor_id = #{instructorId}")
    void deleteInstructor(int instructorId);
}

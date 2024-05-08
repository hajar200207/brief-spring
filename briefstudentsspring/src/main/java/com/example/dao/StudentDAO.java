package com.example.dao;

import com.example.model.Student;
import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    void addStudent(Student student);
}


package com.example.dao;

import com.example.model.Student;
import java.util.List;

public interface StudentDAO {
	  List<Student> getAllStudents(List<Student> students);
	    void addStudent(Student student, List<Student> students);
	    void updateStudent(int studentId, Student updatedStudent, List<Student> students);
	    void deleteStudent(int studentId, List<Student> students);
}


package com.example.dao;

import com.example.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private List<Student> students = new ArrayList<>();

	@Override
	public List<Student> getAllStudents(List<Student> students) {
		 return students;
	}
     @Override
    public void addStudent(Student student, List<Student> students) {
    	 students.add(student);
    }

    @Override
    public void updateStudent(int studentId, Student updatedStudent, List<Student> students) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.setName(updatedStudent.getName());
                student.setRegistrationNumber(updatedStudent.getRegistrationNumber());
                student.setEmail(updatedStudent.getEmail());
                
                break;
            }
        }
    }

    @Override
    public void deleteStudent(int studentId, List<Student> students) {
    	students.removeIf(student -> student.getId() == studentId);
    }

  
}

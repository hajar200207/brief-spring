package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Student;
import com.example.dao.StudentDAO;
import com.example.dao.StudentDAOImpl;

@Controller
@RequestMapping("/")
public class StudentController {

    private final List<Student> studentslist = new ArrayList<>();

    @Autowired
    private StudentDAO studentDAO;


    @GetMapping(value = "/students")
    public String getAllStudents(Model model) {
        List<Student> students = studentDAO.getAllStudents(studentslist);
        model.addAttribute("students", students);
        return "students";
    }

  

    @GetMapping("/add")
    public String addStudentForm(ModelMap modelMap) {
        modelMap.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/add")
    public String addStudentSubmit(@ModelAttribute Student student) {
        studentDAO.addStudent(student, studentslist);
        return "redirect:/students/";
    }


    @RequestMapping(value = "/update/{studentId}", method = RequestMethod.POST)
    public String updateStudent(@PathVariable int studentId, @ModelAttribute("student") Student updatedStudent, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "update-student-form";
        }
        studentDAO.updateStudent(studentId, updatedStudent, studentslist);
        return "redirect:/students/";
    }

    @RequestMapping(value = "/delete/{studentId}", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable int studentId) {
        studentDAO.deleteStudent(studentId, studentslist);
        return "redirect:/students/";
    }

}
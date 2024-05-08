
package com.example.controller;

import com.example.dao.StudentDAO;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("")
    public String showStudents(Model model) {
        model.addAttribute("students", studentDAO.getAllStudents());
        return "students";
    }

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentDAO.addStudent(student);
        return "redirect:/students";
    }

    // Ajouter d'autres méthodes pour mettre à jour, supprimer les étudiants, etc.
}

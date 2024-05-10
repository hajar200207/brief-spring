package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("")
public class studentcontroller {
    private List<student> students = new ArrayList<>();

    @PostConstruct
    public void init() {
        students.add(new student(1,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(2,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(3,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(4,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(5,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(6,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        students.add(new student(7,"hajar", "1234", "OUADIHAJAR@GMAIL.COM"));
        
    }

    private int idCounter = 1;
    @GetMapping("/")
    public String getAllStudents(ModelMap modelMap) {
        modelMap.addAttribute("students", students);
        return "list of students";
    }

    @GetMapping("/addStudent")
    public String addStudentForm(ModelMap modelMap) {
        modelMap.addAttribute("student", new student());
        return "addStudent";
    }
    @PostMapping("/addStudent")
    public String addStudentSubmit(@ModelAttribute student student) {
        System.out.println(student);
        student.setId(idCounter++);
        students.add(student);
        return "redirect:/";
    }
    @GetMapping("/editStudent/{id}")
    public String editStudentForm(@PathVariable int id, Model model) {
        student student = findStudentById(id);
        model.addAttribute("student", student);
        return "editStudent";
    }

    @PostMapping("/editStudent/{id}")
    public String editStudentSubmit(@PathVariable int id, @ModelAttribute student student) {
        student existingStudent = findStudentById(id);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setRegistrationNumber(student.getRegistrationNumber());
            existingStudent.setEmail(student.getEmail());
        }
        return "redirect:/";
    }
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id) {
        students.removeIf(student -> student.getId()==id);
        return "redirect:/";
    }
    private student findStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId()==id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Aucun étudiant avec cet ID trouvé"));
    }
    @GetMapping("/search")
    public String searchStudents(@RequestParam String query, ModelMap modelMap) {
        List<student> searchResults = new ArrayList<>();
        for (student student : students) {
            if (student.getName().toLowerCase().contains(query.toLowerCase())) {
                searchResults.add(student);
            }
        }
        modelMap.addAttribute("students", searchResults);
        return "list of students";
    }

}


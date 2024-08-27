package com.selsoft.controller;

import com.selsoft.model.StudentDetails;
import com.selsoft.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentWebController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    @GetMapping
    public String viewStudents(Model model) {
        List<StudentDetails> students = studentDetailsService.findAll();
        model.addAttribute("students", students);
        return "view-students";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("studentDetails", new StudentDetails());
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute StudentDetails studentDetails) {
        studentDetailsService.save(studentDetails);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        StudentDetails studentDetails = studentDetailsService.findById(id);
        model.addAttribute("studentDetails", studentDetails);
        return "edit-student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute StudentDetails studentDetails) {
        studentDetailsService.save(studentDetails);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentDetailsService.deleteById(id);
        return "redirect:/students";
    }
}

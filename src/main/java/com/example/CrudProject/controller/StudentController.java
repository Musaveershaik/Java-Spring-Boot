package com.example.CrudProject.controller;

import com.example.CrudProject.model.Student;
import com.example.CrudProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // Create
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // Read All
    @GetMapping
    public Iterable<Student> getAllStudents() {
        return repository.findAll();
    }

    // Read by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
        return repository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return repository.save(student);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

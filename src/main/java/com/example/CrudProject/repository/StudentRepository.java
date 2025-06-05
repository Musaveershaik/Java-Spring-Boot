package com.example.CrudProject.repository;

import com.example.CrudProject.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}

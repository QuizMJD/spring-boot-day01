package io.java.web.api;

import io.java.model.Student;
import io.java.service.impl.StudentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentApi {
    private final StudentServiceImpl studentService;

    public StudentApi(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.findAll().get();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

}

package com.aimable.springSecEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList(List.of(
            new Student(1,"shema",60),
            new Student(2,"ganza",40),
            new Student(3,"shem",50),
            new Student(4,"rukundo",70)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    };

    // to return the csrf token
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}

package com.ninos.controller;

import com.ninos.dto.StudentDTO;
import com.ninos.entity.Student;
import com.ninos.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class StudentController {


    private final StudentService studentService;


//    @GetMapping("/all")
//    public List<Student> getAllStudents(){
//        return studentService.getAllStudent();
//    }


    @GetMapping("/all")
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudentDTO();
    }



}

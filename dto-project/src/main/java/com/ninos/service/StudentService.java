package com.ninos.service;

import com.ninos.dto.StudentDTO;
import com.ninos.entity.Student;
import com.ninos.repository.StudentRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepo studentRepo;
    private final ModelMapper modelMapper;

    // method without dto , return entity class
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }



    public List<StudentDTO> getAllStudentDTO(){
        List<Student> students = studentRepo.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();

        for (int i=0; i< students.size(); i++){

            // model mapper will compare entity class with dto class and return the similar attribute between them
            StudentDTO studentDTO = modelMapper.map(students.get(i), StudentDTO.class);

            // put the similar attribute in the studentDTOList
            studentDTOList.add(studentDTO);
        }

        return studentDTOList;
    }









}

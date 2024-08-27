package com.selsoft.service;

import com.selsoft.model.StudentDetails;

import java.util.List;

public interface StudentDetailsService{


    public List<StudentDetails> findAll();

    public StudentDetails findById(Long id) ;

    public void save(StudentDetails studentDetails);

    public void deleteById(Long id) ;
}

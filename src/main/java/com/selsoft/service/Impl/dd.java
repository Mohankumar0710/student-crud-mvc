package com.selsoft.service.Impl;

import com.selsoft.model.StudentDetails;
import com.selsoft.repository.StudentDetailsRepo;
import com.selsoft.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dd implements StudentDetailsService {

    @Autowired
    private StudentDetailsRepo studentDetailsRepo;

    public List<StudentDetails> findAll() {
        return studentDetailsRepo.findAll();
    }

    public StudentDetails findById(Long id) {
        return studentDetailsRepo.findById(id).orElse(null);
    }

    public void save(StudentDetails studentDetails) {
        studentDetailsRepo.save(studentDetails);
    }

    public void deleteById(Long id) {
        studentDetailsRepo.deleteById(id);
    }
}

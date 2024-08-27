package com.selsoft.repository;

import com.selsoft.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails,Long> {
}

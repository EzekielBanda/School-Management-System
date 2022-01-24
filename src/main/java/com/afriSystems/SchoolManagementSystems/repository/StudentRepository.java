package com.afriSystems.SchoolManagementSystems.repository;

import com.afriSystems.SchoolManagementSystems.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

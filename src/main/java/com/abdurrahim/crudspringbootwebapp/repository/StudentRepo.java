package com.abdurrahim.crudspringbootwebapp.repository;

import com.abdurrahim.crudspringbootwebapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> getByName(String name);
}

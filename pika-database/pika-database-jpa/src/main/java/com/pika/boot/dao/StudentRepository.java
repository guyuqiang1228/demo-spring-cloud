package com.pika.boot.dao;

import com.pika.boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {



}

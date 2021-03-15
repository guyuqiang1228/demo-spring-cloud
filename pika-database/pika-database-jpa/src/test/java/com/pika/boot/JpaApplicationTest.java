package com.pika.boot;

import com.pika.boot.dao.StudentRepository;
import com.pika.boot.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class JpaApplicationTest {

    @Resource
    private StudentRepository studentRepository;

    @Test
    public void testFindAll() {
        List<Student> all = studentRepository.findAll();
        System.out.println(all);
    }

}

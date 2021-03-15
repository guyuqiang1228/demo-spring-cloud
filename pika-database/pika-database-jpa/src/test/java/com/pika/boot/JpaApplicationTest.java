package com.pika.boot;

import com.pika.boot.dao.StudentRepository;
import com.pika.boot.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class JpaApplicationTest {

    @Resource
    private StudentRepository studentRepository;

    // 查询所有
    @Test
    public void testFindAll() {
        List<Student> all = studentRepository.findAll();
        System.out.println(all);

        Optional<Student> studentOptional = studentRepository.findById(1);
        Student student = studentOptional.get();
        System.out.println(student);

    }

    // 添加
    @Test
    public void testSave() {
        Student student = new Student();
        student.setName("李四");
        student.setAge(22);
        studentRepository.save(student);
        System.out.println(123);
    }

    // 修改
    @Test
    @Transactional //@Transactional与@Test 一起使用时 事务是自动回滚的。
    @Rollback(false) //取消自动回滚
    public void testUpdate() {
        studentRepository.updateNameById("555", 1);
    }

    // 删除
    @Test
    public void testDelete() {
        studentRepository.deleteById(2);
        System.out.println(123);
    }

}

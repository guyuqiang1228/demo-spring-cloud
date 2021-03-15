package com.pika.boot.dao;

import com.pika.boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author guyuqiang
 * @create 2021-03-15
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("update Student set name = ?1 where id = ?2")
    //需要执行一个更新操作
    @Modifying
    void updateNameById(String name, Integer id);

}

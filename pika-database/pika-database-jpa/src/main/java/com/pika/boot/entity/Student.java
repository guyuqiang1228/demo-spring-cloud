package com.pika.boot.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * @author guyuqiang
 * @create 2021-03-15
 */
@Data
@Entity
@Table(name = "student")
public class Student {

    @Id    //主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

}

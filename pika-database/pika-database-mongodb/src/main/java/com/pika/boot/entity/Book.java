package com.pika.boot.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author guyuqiang
 * @create 2021-03-16
 */
@Data
@Document(collection = "book")
public class Book {

    @Id
    private String id;

    private Integer price;

    private String name;

    private String info;

    private String publish;

    private Date createTime;

    private Date updateTime;

}

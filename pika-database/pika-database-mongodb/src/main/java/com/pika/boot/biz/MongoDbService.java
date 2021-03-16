package com.pika.boot.biz;

import com.pika.boot.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class MongoDbService {

    private static final Logger logger = LoggerFactory.getLogger(MongoDbService.class);

    @Resource
    private MongoTemplate mongoTemplate;

    /**
     * 保存对象
     *
     * @param book
     * @return
     */
    public String saveObj(Book book) {
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        mongoTemplate.save(book);
        return "添加成功";
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<Book> findAll() {
        return mongoTemplate.findAll(Book.class);
    }

    /***
     * 根据id查询
     * @param id
     * @return
     */
    public Book getBookById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        Book book = mongoTemplate.findOne(query, Book.class);
        return book;
    }

    /**
     * 更新对象
     *
     * @param book
     * @return
     */
    public String updateBook(Book book) {
        Query query = new Query(Criteria.where("id").is(book.getId()));
        Update update = new Update().set("publish", book.getPublish()).set("info", book.getInfo()).set("updateTime",
                new Date());
        // updateFirst 更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Book.class);
        // updateMulti 更新查询返回结果集的全部
        // mongoTemplate.updateMulti(query,update,Book.class);
        // upsert 更新对象不存在则去添加
        // mongoTemplate.upsert(query,update,Book.class);
        return "success";
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    public String deleteBookById(String id) {
        Query query = new Query();
        Criteria.where("id").is(id);
        mongoTemplate.remove(query, Book.class);
        return "success";
    }

    /**
     * 模糊查询
     *
     * @param search
     * @return
     */
    public List<Book> findByLikes(String search) {
        Query query = new Query();
        Pattern pattern = Pattern.compile("^.*" + search + ".*$", Pattern.CASE_INSENSITIVE);
        Criteria.where("name").regex(pattern);
        return mongoTemplate.find(query, Book.class);
    }

}

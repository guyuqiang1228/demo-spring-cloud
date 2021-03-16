package com.pika.boot.controller;

import com.pika.boot.biz.MongoDbService;
import com.pika.boot.entity.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guyuqiang
 * @create 2021-03-16
 */
@Api(tags = "mongo控制器")
@RestController
@RequestMapping("/mongo")
public class MongoDbController {

    @Resource
    private MongoDbService mongoDbService;

    @ApiOperation("添加")
    @PostMapping("/save")
    public String saveObj(@RequestBody Book book) {
        return mongoDbService.saveObj(book);
    }

    @ApiOperation("查询所有")
    @GetMapping("/findAll")
    public List<Book> findAll() {
        return mongoDbService.findAll();
    }

    @ApiOperation("根据id查询")
    @GetMapping("/findById/{id}")
    public Book findOne(@PathVariable("id") String id) {
        return mongoDbService.getBookById(id);
    }

    @GetMapping("/findOneByName")
    public Book findOneByName(@RequestParam String name) {
        return mongoDbService.getBookByName(name);
    }

    @PostMapping("/update")
    public String update(@RequestBody Book book) {
        return mongoDbService.updateBook(book);
    }

    @GetMapping("/delById/{id}")
    public String delById(@PathVariable("id") String id) {
        return mongoDbService.deleteBookById(id);
    }

    @GetMapping("/findlikes")
    public List<Book> findByLikes(@RequestParam String search) {
        return mongoDbService.findByLikes(search);
    }

}

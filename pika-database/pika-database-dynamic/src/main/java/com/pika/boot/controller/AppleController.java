package com.pika.boot.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.pika.boot.biz.AppleBiz;
import com.pika.boot.entity.Apple;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author guyuqiang
 * @since 2021-03-12
 */
@Api("apple控制器")
@RestController
@RequestMapping("/boot/apple")
public class AppleController {

    @Resource
    private AppleBiz appleBiz;

    @GetMapping("/{id}")
    @ApiOperation("根据id获取apple")
    @DS("db2")
    public String getApple(@PathVariable("id") Integer id) {
        Apple apple = appleBiz.getById(id);
        return apple.toString();
    }


}

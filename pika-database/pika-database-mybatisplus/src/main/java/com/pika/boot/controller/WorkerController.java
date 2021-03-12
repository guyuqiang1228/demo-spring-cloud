package com.pika.boot.controller;

import com.pika.boot.biz.WorkerBiz;
import com.pika.boot.entity.Worker;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Api("worker控制器")
@Slf4j
@RestController
@RequestMapping("/boot/worker")
public class WorkerController {

    @Resource
    private WorkerBiz workerBiz;

    @ApiOperation(value = "获得worker名字")
    @GetMapping("/name/{id}")
    public String getName(@PathVariable("id") Integer id) {
        Worker worker = workerBiz.getById(id);
        return worker.getName();
    }

    @ApiOperation(value = "111")
    @GetMapping("/info/{id}")
    public String getInfo(@PathVariable("id") Integer id) {
        Worker worker = workerBiz.getInfoById(id);
        return worker.toString();
    }



}

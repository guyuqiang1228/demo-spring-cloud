package com.pika.boot.controller;


import com.pika.boot.biz.WorkerBiz;
import com.pika.boot.entity.Worker;
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
@RestController
@RequestMapping("/boot/worker")
public class WorkerController {

    @Resource
    private WorkerBiz workerBiz;

    @GetMapping("/{id}")
    public String getName(@PathVariable("id") Integer id) {
        Worker worker = workerBiz.getById(id);
        return worker.getName();
    }

}

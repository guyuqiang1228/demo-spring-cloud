package com.pika.boot.biz.impl;

import com.pika.boot.entity.Worker;
import com.pika.boot.dao.WorkerDao;
import com.pika.boot.biz.WorkerBiz;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guyuqiang
 * @since 2021-03-12
 */
@Service
public class WorkerBizImpl extends ServiceImpl<WorkerDao, Worker> implements WorkerBiz {

}

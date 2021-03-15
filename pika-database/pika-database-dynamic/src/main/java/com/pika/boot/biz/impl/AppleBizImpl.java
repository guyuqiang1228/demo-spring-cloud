package com.pika.boot.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.pika.boot.entity.Apple;
import com.pika.boot.dao.AppleDao;
import com.pika.boot.biz.AppleBiz;
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
@DS("slave_1")
public class AppleBizImpl extends ServiceImpl<AppleDao, Apple> implements AppleBiz {

}

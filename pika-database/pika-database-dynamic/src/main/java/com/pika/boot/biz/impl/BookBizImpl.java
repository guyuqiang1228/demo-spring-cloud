package com.pika.boot.biz.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.pika.boot.entity.Book;
import com.pika.boot.dao.BookDao;
import com.pika.boot.biz.BookBiz;
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
public class BookBizImpl extends ServiceImpl<BookDao, Book> implements BookBiz {

}

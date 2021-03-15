package com.pika.boot.dao;

import com.pika.boot.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author guyuqiang
 * @since 2021-03-12
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}

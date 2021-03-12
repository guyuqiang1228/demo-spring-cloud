package com.pika.boot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pika.boot.entity.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author guyuqiang
 * @since 2021-03-12
 */
@Mapper
public interface WorkerDao extends BaseMapper<Worker> {

    Worker getInfoById(@Param("id") Integer id);

}

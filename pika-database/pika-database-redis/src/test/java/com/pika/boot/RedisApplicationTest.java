package com.pika.boot;

import com.pika.boot.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedisApplicationTest {

    @Resource
    private RedisUtils redisUtils;

    @Test
    public void testSave(){
        redisUtils.set("k2","v2");
    }


}

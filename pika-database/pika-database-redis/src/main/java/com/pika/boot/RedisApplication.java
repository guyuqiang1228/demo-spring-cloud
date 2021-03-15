package com.pika.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author guyuqiang
 * @create 2021-03-15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RedisApplication {

    public static void main(String[] args) {
//        disableWarning();
        SpringApplication.run(RedisApplication.class, args);
    }

    public static void disableWarning() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Unsafe u = (Unsafe) theUnsafe.get(null);

            Class cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field logger = cls.getDeclaredField("logger");
            u.putObjectVolatile(cls, u.staticFieldOffset(logger), null);
        } catch (Exception e) {
            // ignore
        }
    }

}

package com.pika.boot.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author guyuqiang
 * @create 2021-03-15
 * <p>
 * 可以使用@Order注解或Ordered接口,有序执行
 * order值越小，执行优先级越高
 *
 * ApplicationRunner 与 CommandLineRunner区别:
 *      ApplicationRunner的run方法的参数为ApplicationArguments 对参数进行了封装
 *      CommandLineRunner的run方法的参数为String... args，直接传入字符串
 */
@Slf4j
@Component
@Order(2)
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("通过实现CommandLineRunner接口,在spring boot项目启动后执行");
    }

}

package com.pika.boot.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 *
 * @author guyuqiang
 * @create 2021-03-12
 */
@Configuration
@EnableKnife4j
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(
                DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Pika API Doc")
                .description("This is a restful api document of Pika!")
                .contact(new Contact("guyuqiang", "个人网址", "你的邮箱"))
                .version("1.0")
                .build();
    }

}

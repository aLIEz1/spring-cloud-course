package com.lm.course;

import com.lm.course.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EnableCircuitBreaker 开启断路器
 *
 * @author zhangfuqi
 * @date 2020/11/27
 */
@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "course-list", configuration = RibbonConfig.class)
@EnableCircuitBreaker
public class CoursePriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoursePriceApplication.class, args);
    }
}

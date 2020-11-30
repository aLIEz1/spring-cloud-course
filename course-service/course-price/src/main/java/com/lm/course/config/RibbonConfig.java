package com.lm.course.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangfuqi
 * @date 2020/11/30
 */
public class RibbonConfig {
    @Bean
    public IRule rule() {
        return new WeightedResponseTimeRule();
    }
}

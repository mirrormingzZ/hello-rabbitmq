package cn.mirrorming.hellorabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: hello-rabbitmq
 * @description: 配置
 * @author: mirrorming
 * @create: 2018-12-05 11:40
 **/
@Configuration
public class RabbitMQConfiguration {

    @Bean
    public Queue queue() {
        return new Queue("hello,RabbitMQ");
    }
}


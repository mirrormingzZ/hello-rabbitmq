package cn.mirrorming.hellorabbitmq.provider;
/**
 * @program: hello-rabbitmq
 * @description: 提供者
 * @author: mirrorming
 * @create: 2018-12-05 11:43
 **/

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitProvider {
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * @return: void
     * @Author: mirrorming
     * @Date: 2018/12/5
     */
    public void send() {
        String content = "hello , RabbitMQ";
        System.out.println("Provider:" + content);
        amqpTemplate.convertAndSend("hello,RabbitMQ", content);
    }
}



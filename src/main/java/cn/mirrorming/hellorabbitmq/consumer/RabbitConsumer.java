package cn.mirrorming.hellorabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: hello-rabbitmq
 * @description: 消费者
 * @author: mirrorming
 * @create: 2018-12-05 11:58
 **/
@Component
@RabbitListener(queues = "hello,RabbitMQ")
public class RabbitConsumer {
    /**
     * @Param: [content]
     * @return: void
     * @Author: mirrorming
     * @Date: 2018/12/5
     */
    @RabbitHandler
    public void consumer(String content) {
        System.out.println("Consumer" + content);
    }
}



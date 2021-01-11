package com.baizhi.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component                                               //是否持久化       是否自动删除
@RabbitListener(queuesToDeclare = @Queue(value = "hello",durable = "false",autoDelete = "true"))
public class HelloCustomer {

    @RabbitHandler
    public void receivel(String message){
        System.out.println("message="+message);
    }
}

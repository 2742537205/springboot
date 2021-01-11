package com.baizhi.topic;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicCustomer {

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(type = "topic",name = "topics"), //指定交换机名称和类型
                    key = {"user.save","user.*"}
            )
    })
    public void receivel(String message){
        System.out.println("message1 = "+message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(type = "topic",name = "topics"), //指定交换机名称和类型
                    key = {"order.#","produce.#","user.*"}
            )
    })
    public void receive2(String message){
        System.out.println("message2 = "+message);
    }
}

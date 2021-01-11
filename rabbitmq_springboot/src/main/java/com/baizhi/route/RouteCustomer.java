package com.baizhi.route;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RouteCustomer {

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "directs",type = "direct"), //指定交换机名称和类型
                    key = {"info","error","warn"}
            )
    })
    public void receivel(String message){
        System.out.println("message = "+message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "directs",type = "direct"), //指定交换机名称和类型
                    key = {"error","info"}
            )
    })
    public void receive2(String message){
        System.out.println("message2 = "+message);
    }

}

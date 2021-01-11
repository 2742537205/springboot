package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RabbitmqSpringbootApplication.class)
@RunWith(SpringRunner.class)
public class TestRabbitMQ {

    //注入rabbitTemplate
    @Autowired
    private RabbitTemplate rabbitTemplate;

    //hello  world  (一个生产者及一个消费者)
    @Test
    public void test(){
        rabbitTemplate.convertAndSend("hello","hello world");
    }

    //work  (一个生产者及多个消费者)
    @Test
    public void testWork(){
        for(int i=0;i<10;i++){
            rabbitTemplate.convertAndSend("work","work模型");
        }
    }

    //fanout 广播
    @Test
    public void testFanout(){
        rabbitTemplate.convertAndSend("logs","","Fanout的模型发送的消息");
    }

    //路由模式
    @Test
    public void testRoute(){
        rabbitTemplate.convertAndSend("directs","info","发送info的key的路由信息");
    }

    //topic 动态路由  订阅模式
    @Test
    public void testTopic(){
        rabbitTemplate.convertAndSend("topics","order","user.save 路由消息");
    }

}

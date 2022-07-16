package com.demo.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class AppConsumer {

    @KafkaListener(topics = "kafka-demo", groupId = "app-kafka-demo-group")
    public void processMessages(ConsumerRecord<String, Order> consumerRecord) {
        System.out.println("Consumer started consuming messages");
        System.out.println(consumerRecord);
    }
}

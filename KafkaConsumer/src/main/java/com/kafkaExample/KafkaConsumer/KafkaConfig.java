package com.kafkaExample.KafkaConsumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	
	/*
	 * @KafkaListener is a Spring annotation used to consume messages from Kafka
	 * topics. 
	 * It marks a method to be the message handler for incoming Kafka records.
       When you annotate a method with @KafkaListener,Spring automatically configures it to listen to the specified Kafka topic(s).
	 * Internally,it uses a message-driven container that polls Kafka and invokes your method when new messages arrive. 
	 * 
	 * topics: The Kafka topic(s) to listen to.
	 * groupId: The consumer group ID.
	 * The method parameter receives the message payload (can be a string, object,
	 * or even a full ConsumerRecord).
	 */
	
	@KafkaListener(topics ="sid-produce-message", groupId ="my-consumer-group")
	public void  consumeMessage(String Value)
	{
		System.out.println("Value in consumer application="+Value);
	}

}

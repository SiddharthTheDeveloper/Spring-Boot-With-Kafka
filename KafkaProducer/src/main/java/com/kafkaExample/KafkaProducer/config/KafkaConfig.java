package com.kafkaExample.KafkaProducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
	
	/*
	 * Kafka topic A Kafka topic is like a folder or channel where messages are
	 * stored and organized. Producers send messages to a topic, and consumers read
	 * messages from it.
	 */
	
	
	/*
	 * In Spring for Apache Kafka, NewTopic is a class used to programmatically
	 * create a Kafka topic when your application starts.
	 * 
	 * name("sid-produce-message"): The name of your topic.
	 * 
	 * partitions(3): Splits the topic into 3 parts for parallel processing.
	 * 
	 * replicas(1): Keeps 1 copy of each partition for fault tolerance.
	 * 
	 * This bean gets picked up by Spring and automatically creates the topic when
	 * the app connects to Kafka.
	 */
	
	/*
	 * When yourSpring Boot application starts,Spring scans for @Bean methods,
	 * 
	 * It finds myTopic() and creates a NewTopic object, Spring Kafka uses this to
	 * automatically create the Kafka topic with the specified name, partitions, and
	 * replicas — if it doesn’t already exist.
	 */

	@Bean
	public NewTopic newTopic() {

		return TopicBuilder.name("sid-produce-message")
				// .partitions(3)
				// .replicas(1)
				.build();
	}
}

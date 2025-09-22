package com.kafkaExample.KafkaProducer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	/*
	 * KafkaTemplate is a core class provided by Spring for Apache Kafka that
	 * simplifies sending messages to Kafka topics. It’s part of the spring-kafka
	 * library and follows the familiar Spring "template" pattern (like JdbcTemplate
	 * or RestTemplate). 
	 * 
	 * KafkaTemplate is initialized with a ProducerFactory, which creates KafkaProducer instances.
	 * This factory ensures thread safety and manages producer lifecycle. 
	 * Type Parameters: KafkaTemplate<K, V> where K is the key type and V is the value type.
	 * 
	 * Common Methods:
	 * 
	 * send(String topic, V data)
	 * 
	 * send(String topic, K key, V data)
	 * 
	 * sendDefault(V data)
	 * 
	 * flush()
	 */

	private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

	public void producemessage(String message) {

		kafkaTemplate.send("sid-produce-message", message);
		//logger.info("message=" + message);

	}

}

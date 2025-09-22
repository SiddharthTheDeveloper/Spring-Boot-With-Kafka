package com.kafkaExample.KafkaProducer.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaExample.KafkaProducer.service.KafkaProducerService;

@RestController
@RequestMapping("/produce")
public class KafkaProducerController {
	
	@Autowired
	KafkaProducerService  kafkaProducerService;
	
	@PostMapping("/message")
	public ResponseEntity<String> producemessage()
	
	{
		for (int i=1; i<=10000 ;i++) {
		kafkaProducerService.producemessage((Math.round(Math.random()*100))+","+(Math.round(Math.random()*100)));
		}
		return new ResponseEntity<> ("Messages sent successfully",HttpStatus.OK);
	}
	

}

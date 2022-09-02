package com.personal.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="init-message", groupId="mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consumed message: "+message);
	}
}

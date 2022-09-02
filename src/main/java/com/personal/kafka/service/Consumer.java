package com.personal.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private static Logger logger = LoggerFactory.getLogger(Consumer.class);
	@KafkaListener(topics="init-message", groupId="mygroup")
	public void consumeFromTopic(String message) {
		logger.info("Consumed message: {}", message);
	}
}

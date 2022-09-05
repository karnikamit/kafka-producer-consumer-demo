package com.personal.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@ComponentScan(basePackages = "com.personal.kafka.service.Producer")
@Service
public class Producer {
	private final static Logger logger = LoggerFactory.getLogger(Producer.class);

	public static final String topic = "init-message";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;

	/**
	 * Method to publish message to a topic
	 * @param message
	 */
	public void publishMessage(String message) {
		logger.info("Publishing message: {} to topic: {}", message, topic);
		this.kafkaTemp.send(topic, message);
	}

}

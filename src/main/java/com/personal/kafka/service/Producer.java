package com.personal.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	public static final String topic = "init-message";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;

	/**
	 * Method to publish message to a topic
	 * @param message
	 */
	public void publishMessage(String message) {
		System.out.println("Publishing to topic: " + topic);
		this.kafkaTemp.send(topic, message);
	}

}

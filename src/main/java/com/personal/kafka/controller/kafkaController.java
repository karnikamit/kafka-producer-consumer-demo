package com.personal.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.personal.kafka.service.Producer;

@ComponentScan(basePackages = "com.personal.kafka.service.kafkaController")
@RestController
@RequestMapping("/kafka")	//localhost:8080/kafka
public class kafkaController {

	private final static Logger logger = LoggerFactory.getLogger(kafkaController.class);
	@Autowired
	Producer producer;

	@PostMapping(value="/post")	// localhost:8080/kafka/post?msg=<message>
	public void sendMessage(@RequestParam("msg") String msg) {
		logger.info("Received msg to publish: {}", msg);
		producer.publishMessage(msg);
	}

}

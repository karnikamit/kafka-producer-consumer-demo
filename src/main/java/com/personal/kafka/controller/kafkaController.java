package com.personal.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personal.kafka.service.Producer;

@SpringBootApplication
@RestController
@RequestMapping("/kafka")
public class kafkaController {

	@Autowired
	Producer producer;

	@PostMapping(value="/post")
	public void sendMessage(@RequestParam("msg") String msg) {
		producer.publishMessage(msg);
	}

	public static void main(String[] args) {
		System.out.println("Controller called");
	}
}

package com.tesco.example.kafka;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class KafkaController {

	@Autowired
	KafkaEventPublisher publisher;
	
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	
	@Scheduled(cron = "0 57 15 * * MON-FRI")
	public void publish(){
		publisher.publish("The time is: " +  dateFormat.format(new Date()));
	}
	
}

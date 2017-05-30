package com.tesco.example.kafka;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventListener {
	
	@StreamListener(IBroker.INPUT_CHANNEL)
	public void receiveEvent(Message message) {
		System.out.println("Kafka Event received: " + message.getPayload().toString());
	}
}
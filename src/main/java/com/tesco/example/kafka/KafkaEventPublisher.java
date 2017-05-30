package com.tesco.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventPublisher {
	
	private MessageChannel output;

    @Autowired
    public KafkaEventPublisher(@Qualifier(IBroker.OUTPUT_CHANNEL) MessageChannel output) {
        this.output = output;
    }

	
    public void publish(String name) {
    	this.output.send(MessageBuilder.withPayload(name).build());
    }

}

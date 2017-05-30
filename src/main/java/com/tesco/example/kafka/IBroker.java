package com.tesco.example.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface IBroker {
	
	public static final String INPUT_CHANNEL = "customInput";
	
	public static final String OUTPUT_CHANNEL = "customOutput";
	
	 @Input(INPUT_CHANNEL)
	 SubscribableChannel input();
	 
	 @Output(OUTPUT_CHANNEL)
	 MessageChannel output();

}

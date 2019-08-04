package com.sravan.prodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sravan.prodos.client.FeedbackClient;

@RestController
public class HomeController {
	
	@Autowired
	FeedbackClient feedbackClient;
	
	@GetMapping
	String home() {
		
		
		return "Hello World!!"+feedbackClient.getHost()+" - "+feedbackClient.getPort();
	}

}

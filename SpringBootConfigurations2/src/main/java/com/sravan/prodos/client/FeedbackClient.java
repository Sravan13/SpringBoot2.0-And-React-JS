package com.sravan.prodos.client;

public class FeedbackClient {
	
	String host;
	int port;
	
	public FeedbackClient(String host, int port) {
		this.host = host;
		this.port = port;		
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}

package com.sravan.prodos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sravan.prodos.client.FeedbackClientConfiguration;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
@Import(FeedbackClientConfiguration.class)
public class HomeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
		
	@Test
	public void testHome() throws Exception{
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello World!!192.168.10.21 - 9900")));
		
	}

}

package com.xhyj.meeting;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.xhyj.meeting.controller.MeetBaseInfoController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MeetingServerApplicationTests {
	private MockMvc mvc;
	@Before
	public void init() {
		this.mvc = MockMvcBuilders.standaloneSetup(new MeetBaseInfoController()).build();
	}
	@Test
	public void query() throws Exception {
		RequestBuilder req = get("/meet/query?pageNum=1&name=abc");
		ResultActions ra = mvc.perform(req);
		ra.andExpect(status().isOk());
		System.out.println(ra.toString());
	}
	@Test
	public void contextLoads() {
	}

	
}

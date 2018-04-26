package com.xhyj.meeting;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.xhyj.meeting.dto.ReturnData;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MeetingServerApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate = new TestRestTemplate();
	
	private String baseUrl = "http://localhost:9080";
	@Before
	public void init() {
	}
	@Test
	public void testAll() throws Exception {
		queryAll();
		queryOnePage();
	}
	@Test
	public void queryAll() throws Exception {
		String url = baseUrl+"/meet/queryAll";
        ResponseEntity<ReturnData> result = restTemplate.getForEntity(url, ReturnData.class);
        assertThat(result.getBody().getCode().equals("0")).isEqualTo(true);
        System.out.println(result);
        System.out.println("getCentent----"+result.getBody().getCentent());
        System.out.println("page----"+result.getBody().getPage());
	}
	@Test
	public void queryOnePage() throws Exception {
		String url = baseUrl+"/meet/queryOnePage";
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
        map.add("pageNum", "0");  
        map.add("name", "会议名称1");  
        map.add("stt", "10");  
        ReturnData result = restTemplate.postForObject(url, map, ReturnData.class);
        System.out.println(result);
        int a = result.getPage().getNumberOfElements();
        int b = ((List<?>)result.getCentent()).size();
        assertThat(a==b).isEqualTo(true);
        assertThat(result.getCode().equals("0")).isEqualTo(true);
	}
	@Test
	public void queryOneById() throws Exception {
		String url = baseUrl+"/meet/queryOneById";
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
        map.add("id", "10010");  
        ReturnData result = restTemplate.postForObject(url, map, ReturnData.class);
        System.out.println(result);
        assertThat(result.getCode().equals("0")).isEqualTo(true);
	}
	@Test
	public void add() throws Exception {
		String url = baseUrl+"/meet/add";
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
        map.add("name", "name123123");
        map.add("hostOrg", "hostOrg111");
        map.add("beginDate", "20180428");
        map.add("endDate", "20180428");
        map.add("address", "address-123123");
        map.add("stt", "00");
        map.add("lastApplyDate", "20180528");
        map.add("applyConfirmFlag", "0");
        map.add("feastConfirmFlag", "0");
        ReturnData result = restTemplate.postForObject(url, map, ReturnData.class);
        System.out.println(result);
        assertThat(result.getCode().equals("0")).isEqualTo(true);
	}
	@Test
	public void update() throws Exception {
		String url = baseUrl+"/meet/update";
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
        map.add("id", "6440ac1686c54c91b0b3c3bbcdd8e860");  
        map.add("name", "new--12341234");
        map.add("address", "address-123123");
        ReturnData result = restTemplate.postForObject(url, map, ReturnData.class);
        System.out.println(result);
        assertThat(result.getCode().equals("0")).isEqualTo(true);
	}
	@Test
	public void delete() throws Exception {
		String url = baseUrl+"/meet/delete";
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>(); 
        map.add("id", "6440ac1686c54c91b0b3c3bbcdd8e860");  
        ReturnData result = restTemplate.postForObject(url, map, ReturnData.class);
        System.out.println(result);
        assertThat(result.getCode().equals("0")).isEqualTo(true);
	}
	@Test
	public void contextLoads() {
	}

	
}

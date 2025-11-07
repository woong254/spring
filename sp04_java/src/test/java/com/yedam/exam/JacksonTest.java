package com.yedam.exam;


import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yedam.emp.mapper.Sample;

public class JacksonTest {

	@Test
	public void toObject() throws JsonMappingException, JsonProcessingException {
		String json = "{\"name\":\"hong\",\"age\":20}";
		ObjectMapper objectMapper = new ObjectMapper();
		Sample sample = objectMapper.readValue(json, Sample.class);
		System.out.println("name="+sample.getName());
	}
	
	@Test
	public void toJson() throws JsonProcessingException {
		Sample sample = new Sample();
		sample.setName("김유미");
		sample.setAge(20);
		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(sample);
		System.out.println(str);
	}
}

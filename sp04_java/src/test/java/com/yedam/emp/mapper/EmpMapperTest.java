package com.yedam.emp.mapper;



import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;

@SpringJUnitConfig(classes = {DataSourceConfig.class,
					          MybatisConfig.class, 
					          RootConfig.class})
public class EmpMapperTest {
	
	@Autowired 
	EmpMapper empMapper;
	
	@Test
	public void 단건조회() {
		//given
		int empid = 100;
		String lastName = "King";
		
		//when
		Map emp =empMapper.selectone(empid);
		
		//then
		assertEquals(emp.get("LAST_NAME"), lastName);
		
	}

}

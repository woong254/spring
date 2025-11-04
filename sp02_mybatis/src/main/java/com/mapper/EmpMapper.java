package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
	Map selectone(int id);
	List<Employee> selectall();
}

package com.resourseLayer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsClass {

	public static String convertJavaToJSON(Object obj) throws Exception
	{
		ObjectMapper mapper= new ObjectMapper();
	
		return mapper.writeValueAsString(obj);
	}
}

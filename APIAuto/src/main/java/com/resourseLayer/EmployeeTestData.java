package com.resourseLayer;

import com.pojoLayer.EmployeePOJO;

public class EmployeeTestData {
	
	public static String createNewEmployee(String name, String job) throws Exception
	{
		EmployeePOJO emp= new EmployeePOJO();
		emp.setName(name);
		emp.setJob(job);
		return UtilsClass.convertJavaToJSON(emp);
	
	}

}

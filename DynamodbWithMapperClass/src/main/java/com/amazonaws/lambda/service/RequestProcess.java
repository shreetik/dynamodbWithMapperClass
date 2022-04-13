package com.amazonaws.lambda.service;

import java.util.List;

import com.amazonaws.lambda.entities.Employee;
import com.amazonaws.lambda.entities.Response;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class RequestProcess {
	
	Response response = new Response();
	
	public Response doProcess(String action, String region, Employee employee) {
	
		switch (action) {
		
		case "save":
		{
			AmazonDynamoDB client = AmazonDynamoDBClientBuilder
			.standard()
			.withRegion(region)
			.build();
			
			try {
				DynamoDBMapper mapper = new DynamoDBMapper(client);
				mapper.save(employee);
				response.setStatu("200");
				response.setMsg("Data saved successfully..!!");
				response.setEmp(null);
				return response;
			} catch (Exception e) {
				e.printStackTrace();
				response.setStatu("400");
				response.setMsg("error");
				response.setEmp(null);
				return response;
			}
		}
		
		case "fetch":{
			
			AmazonDynamoDB client = AmazonDynamoDBClientBuilder
					.standard()
					.withRegion(region)
					.build();
					
					try {
						DynamoDBMapper mapper = new DynamoDBMapper(client);
					Class<Employee> emp =	mapper.load(Employee.class);
						response.setStatu("200");
						response.setMsg("Data retrived successfully..!!");
						response.setEmp(emp);
						return response;
					} catch (Exception e) {
						e.printStackTrace();
						response.setStatu("400");
						response.setMsg("error");
						response.setEmp(null);
						return response;
					}
			
		}

		default:
			response.setStatu("400");
			response.setMsg("Action is not valid");
			response.setEmp(null);
			return response;
		}
		
		
		
	}
}

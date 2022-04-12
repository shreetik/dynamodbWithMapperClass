package com.amazonaws.lambda.service;

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
			
			AmazonDynamoDB client = AmazonDynamoDBClientBuilder
			.standard()
			.withRegion(region)
			.build();
			
			try {
				DynamoDBMapper mapper = new DynamoDBMapper(client);
				mapper.save(employee);
				response.setStatu("200");
				response.setMsg("Data saved successfully..!!");
				
				return response;
			} catch (Exception e) {
				e.printStackTrace();
				response.setStatu("400");
				response.setMsg("error");
				return response;
			}

		default:
			response.setStatu("400");
			response.setMsg("Action is not valid");
			return response;
		}
		
		
		
	}
}

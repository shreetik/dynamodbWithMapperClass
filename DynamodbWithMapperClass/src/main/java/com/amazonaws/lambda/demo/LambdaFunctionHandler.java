package com.amazonaws.lambda.demo;

import com.amazonaws.lambda.entities.Employee;
import com.amazonaws.lambda.entities.Request;
import com.amazonaws.lambda.entities.Response;
import com.amazonaws.lambda.service.RequestProcess;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Request, Response> {

	RequestProcess res = new RequestProcess();
	Response response = new Response();
    @Override
    public Response handleRequest(Request input, Context context) {
        context.getLogger().log("Input: " + input);
        Employee employee = new Employee();
        String action,region;
        
        try {
			
        	action = input.getAction();
        	region = input.getRegion();
        	
        	employee.setEmp_id(input.getEmpId());
        	employee.setEmp_name(input.getEmpName());
        	employee.setDesignation(input.getDesignation());
        	employee.setEmail(input.getEmail());
        	
        	return res.doProcess(action, region, employee);
        	
        	
		} catch (Exception e) {
			response.setStatu("400");
			response.setMsg("error in handleRequest");
			return response;
		}
       
        
    }

}

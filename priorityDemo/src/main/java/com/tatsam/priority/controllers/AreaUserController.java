package com.tatsam.priority.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tatsam.priority.models.RequestJSONWrapper;
import com.tatsam.priority.services.PriorityService;

@RestController
public class AreaUserController {
    
	@Autowired
	PriorityService priorityService; 
	
	
	@GetMapping("/data")
	public Object getAreaNames() {
		return priorityService.fetchAreaName();
	}
	
	@PostMapping(path = "/save", consumes = "application/json")
	public Object savePriorityDetails (@RequestBody String jsonString) {
		
		ObjectMapper objMapper = new ObjectMapper();
		try {
			RequestJSONWrapper reqJsonWrapper = objMapper.readValue(jsonString, RequestJSONWrapper.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
}

package com.expample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatsam.priority.services.PriorityService;

@RestController
@RequestMapping("/api/area")
public class AreaUserController {
    
	@Autowired
	PriorityService priorityService; 
	
	
	@GetMapping
	public Object getAreaNames() {
		
		return priorityService.fetchAreaName();
	}
	
	@PostMapping(path = "/save", consumes = "application/json")
	public Object savePriorityDetails (@RequestBody )
}

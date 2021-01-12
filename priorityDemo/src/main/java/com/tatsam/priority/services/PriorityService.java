package com.tatsam.priority.services;

import java.util.List;

import com.tatsam.priority.models.RequestJSONWrapper;

public interface PriorityService {
  public List<String> fetchAreaName();
  public String saveDetails(RequestJSONWrapper reqJWrapper);
}

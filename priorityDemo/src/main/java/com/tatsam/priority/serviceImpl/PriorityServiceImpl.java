package com.tatsam.priority.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatsam.priority.entities.Area;
import com.tatsam.priority.entities.UserAreaPriority;
import com.tatsam.priority.models.Details;
import com.tatsam.priority.models.RequestJSONWrapper;
import com.tatsam.priority.repository.AreaRepository;
import com.tatsam.priority.repository.UserAreaPriorityRepository;
import com.tatsam.priority.services.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {

	@Autowired
	AreaRepository areaRepo;
	@Autowired
	UserAreaPriorityRepository userAreaRepo;

	@Override
	public List<String> fetchAreaName() {

		List<Area> areaList = areaRepo.findAll();
		List<String> areaNameList = new ArrayList<>();
		for (Area area : areaList) {
			areaNameList.add(area.getAreaName());
		}
		return areaNameList;
	}

	@Override
	public String saveDetails(RequestJSONWrapper reqJWrapper) {

		Integer userId = reqJWrapper.getUserId();
		List<Details> detailsList = reqJWrapper.getDetails();
		
		/** fetching data from table (area)*/
		List<Area> areaList = areaRepo.findAll();

		List<UserAreaPriority> priorityList = new ArrayList<UserAreaPriority>();

		for (Details details : detailsList) {
			UserAreaPriority userAreaPriority = new UserAreaPriority();
			userAreaPriority.setUserId(userId);
			for (Area area : areaList) {
				if (area.getAreaName().equals(details.getAreaName())) {
					userAreaPriority.setAreaId(area.getId());
					break;
				}
			}
			userAreaPriority.setPriority(details.getPriority());
			userAreaPriority.setSatisfaction(details.getSatisfaction());
			priorityList.add(userAreaPriority);
		}
		/** saving data to table (user_area_pririty)*/
		 userAreaRepo.saveAll(priorityList);
		return "successfully saved all prior";
}
}

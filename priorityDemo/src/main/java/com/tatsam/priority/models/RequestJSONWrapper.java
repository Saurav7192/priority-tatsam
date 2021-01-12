package com.tatsam.priority.models;

import java.util.List;

public class RequestJSONWrapper {

	private Integer userId;
	private List<Details> details;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "RequestJSONWrapper [userId=" + userId + ", details=" + details + "]";
	}

}

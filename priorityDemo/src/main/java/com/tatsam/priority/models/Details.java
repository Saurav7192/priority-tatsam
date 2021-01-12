package com.tatsam.priority.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Details {

	private String areaName;
	@JsonIgnoreProperties
	private Integer areaId;

	private Integer priority;
	private Integer satisfaction;

	public Details() {
		super();
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(Integer satisfaction) {
		this.satisfaction = satisfaction;
	}

	@Override
	public String toString() {
		return "Details [areaName=" + areaName + ", priority=" + priority + ", satisfaction=" + satisfaction + "]";
	}

}

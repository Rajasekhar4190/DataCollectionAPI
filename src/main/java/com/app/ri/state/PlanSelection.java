package com.app.ri.state;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="PLANS_TAB")
@Data
public class PlanSelection {
	@Id
	private Long id;
	@Column(name="PLAN NAME")
	private String plan_Name;
	private CaseNumber case1;

}

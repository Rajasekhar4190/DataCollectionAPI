package com.app.ri.state;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="INCOMING TAB")
@Data
public class IncomeDetails {
	@Id
	private Long id;
	@Column(name="MONTHLY SALARY  INCOME")
	private Double mon_salar_income;
	@Column(name="RENT INCOME")
	private Double rent_income;
	@Column(name="PROPERLY INCOME")
	private Double pro_income;
	private CaseNumber case1;

}

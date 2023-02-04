package com.app.ri.state;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EDUCATION")
@Data
public class EducationDetails {
	@Id
	private Long id;
	@Column(name="HIGEST DEGREE")
	private String hig_Degree;
	@Column(name="GRADUATION YEAR")
	private Long grad_Year;
	@Column(name="UNIVERSITY NAME")
	private String un_nmae;
	private CaseNumber case1;

}

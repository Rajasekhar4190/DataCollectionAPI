package com.app.ri.state;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CASE_TABLE")
@Data
public class CaseNumber {
	@Id
	@GeneratedValue
	@Column(name="AppID")
	private Long app_Id;

}

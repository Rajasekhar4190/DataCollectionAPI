package com.app.ri.state;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="KIDS TABLE")
@Data
public class KidsDetails {
    @Id
	private Long id;
    @Column(name="KID NAME")
    private String kidName;
    @Column(name="AGE")
    private int age;
    @Column(name="KIDSSN")
    private String kidSSN;
    private CaseNumber case1;
}

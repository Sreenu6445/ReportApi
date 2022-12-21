package com.sreenu.demo.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Reports_Details")
public class ReportApiEntity {

	private Integer sno;
	private String name;
	private String eMail;
	private Integer mobileNum;
	private String gender;
	private Integer ssn;
	
}

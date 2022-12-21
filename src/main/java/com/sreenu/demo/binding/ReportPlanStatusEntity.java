package com.sreenu.demo.binding;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Plan_Status")
public class ReportPlanStatusEntity {

	private Integer sno;
	private String planStatus;
}

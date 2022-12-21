package com.sreenu.demo.service;

import java.util.List;

import com.sreenu.demo.binding.ReportApiEntity;

public interface ReportApiService {
	public List<ReportApiEntity> getAllDetails();
	public String getPlanName(String planName);
	public String getPlanStatus(String planStatus);
	public String getPdfFile();
	public String getExcelFile();

}

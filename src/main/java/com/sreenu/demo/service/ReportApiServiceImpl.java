package com.sreenu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.demo.binding.ReportApiEntity;
import com.sreenu.demo.repository.ReportApiRepo;

@Service
public class ReportApiServiceImpl implements ReportApiService{

	@Autowired
	public ReportApiRepo repo;
	
	@Override
	public String getPlanName(String planName) {
		
		return null;
	}

	@Override
	public String getPlanStatus(String planStatus) {
		
		return null;
	}

	@Override
	public List<ReportApiEntity> getAllDetails() {
		
		return null;
	}

	@Override
	public String getPdfFile() {
		
		return null;
	}

	@Override
	public String getExcelFile() {
		
		return null;
	}
	

}

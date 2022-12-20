package com.sreenu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sreenu.demo.binding.ReportApiEntity;

public interface ReportApiRepo extends JpaRepository<ReportApiEntity, String> {

}

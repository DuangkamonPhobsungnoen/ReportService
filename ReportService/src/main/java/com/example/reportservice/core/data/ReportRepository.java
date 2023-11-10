package com.example.reportservice.core.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<ReportEntity, Integer> {
    // Custom query methods if needed
}

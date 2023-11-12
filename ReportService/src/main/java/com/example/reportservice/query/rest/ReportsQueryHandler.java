package com.example.reportservice.query.rest;

import com.example.reportservice.core.data.ReportEntity;
import com.example.reportservice.core.data.ReportRepository;
import com.example.reportservice.query.FindReportsQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportsQueryHandler {
//    private final ReportRepository reportRepository;
//
//    public ReportsQueryHandler(ReportRepository reportRepository) {
//        this.reportRepository = reportRepository;
//    }

//    @QueryHandler
//    public List<ReportRestModel> findReports(FindReportsQuery query) {
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        List<ReportRestModel> reportRest = new ArrayList<>();
//        List<ReportEntity> storedBooks = reportRepository.findAll();
//        for (ReportEntity reportEntity : storedBooks) {
//            ReportRestModel reportRestModel = new ReportRestModel();
//            BeanUtils.copyProperties(reportEntity, reportRestModel);
//            reportRest.add(reportRestModel);
//        }
//        return reportRest;
//    }
}

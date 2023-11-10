package com.example.reportservice.query.rest;

import com.example.reportservice.query.FindReportsQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportQueryController {
    private final ReportQueryHandler reportQueryHandler;

    public ReportQueryController(ReportQueryHandler reportQueryHandler) {
        this.reportQueryHandler = reportQueryHandler;
    }

    @GetMapping("/reports/{reportId}")
    public ReportRestModel getReport(@PathVariable int reportId) {
        return reportQueryHandler.handle(new FindReportsQuery(reportId));
    }
}

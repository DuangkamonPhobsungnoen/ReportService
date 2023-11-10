package com.example.reportservice.command.rest;

import com.example.reportservice.command.ReportCommandService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportCommandController {
    private final ReportCommandService reportCommandService;

    public ReportCommandController(ReportCommandService reportCommandService) {
        this.reportCommandService = reportCommandService;
    }

    @PostMapping("/reports")
    public void createReport(@RequestBody CreateReportRestmodel createReportRestModel) {
        reportCommandService.createReport(new CreateReportRestmodel(createReportRestModel));
    }
}

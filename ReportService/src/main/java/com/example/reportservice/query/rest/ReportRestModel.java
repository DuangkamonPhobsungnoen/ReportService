package com.example.reportservice.query.rest;

import lombok.Data;

@Data
public class ReportRestModel {
    private String reportId;
    private String type;
    private String reportTargetId;
}

package com.example.reportservice.command.rest;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateReportRestModel implements Serializable {
    private String type;
    private String reportTargetId;

    public CreateReportRestModel() {}

    public CreateReportRestModel(String type, String reportTargetId) {
        this.type = type;
        this.reportTargetId = reportTargetId;
    }
}

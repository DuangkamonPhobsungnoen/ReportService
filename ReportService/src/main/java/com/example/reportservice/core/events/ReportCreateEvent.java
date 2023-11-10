package com.example.reportservice.core.events;

import lombok.Data;

@Data
public class ReportCreateEvent {
    private String reportId;
    private String name;
    private String post;
    private String comment;
}

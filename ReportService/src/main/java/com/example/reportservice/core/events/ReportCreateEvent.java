package com.example.reportservice.core.events;

import lombok.Data;

@Data
public class ReportCreateEvent {
    private String reportId;
    private String type;
    private String reportTargetId;
}

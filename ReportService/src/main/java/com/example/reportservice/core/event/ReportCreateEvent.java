package com.example.reportservice.core.event;

import com.example.reportservice.command.ReportAggregate;
import org.springframework.context.ApplicationEvent;

public class ReportCreateEvent extends ApplicationEvent {
    private final ReportAggregate reportAggregate;

    public ReportCreateEvent(ReportAggregate reportAggregate) {
        super(reportAggregate);
        this.reportAggregate = reportAggregate;
    }

    public ReportAggregate getReportAggregate() {
        return reportAggregate;
    }
}
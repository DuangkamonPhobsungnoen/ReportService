package com.example.reportservice.command;

import com.example.reportservice.core.events.ReportCreateEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;


@Aggregate
public class ReportAggregate {
    @AggregateIdentifier
    private String reportId;
    private String name;
    private String post;
    private String comment;

    public ReportAggregate() {}

    @CommandHandler
    public ReportAggregate(CreateReportCommand createReportCommand) {
        System.out.println("Report Aggregate");
        ReportCreateEvent reportCreateEvent = new ReportCreateEvent();
        BeanUtils.copyProperties(createReportCommand, reportCreateEvent);
        AggregateLifecycle.apply(reportCreateEvent);
    }

    @EventSourcingHandler
    public void on(ReportCreateEvent reportCreateEvent) {
        System.out.println("ON AGGREGATE");
        this.reportId = reportCreateEvent.getReportId();
        this.name = reportCreateEvent.getName();
        this.comment = reportCreateEvent.getComment();
        this.post = reportCreateEvent.getPost();
    }
}

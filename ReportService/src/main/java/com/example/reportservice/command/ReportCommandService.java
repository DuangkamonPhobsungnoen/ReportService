package com.example.reportservice.command;

import com.example.reportservice.core.event.ReportCreateEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ReportCommandService {
    private final ApplicationEventPublisher eventPublisher;

    public ReportCommandService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void createReport(CreateReportCommand createReportCommand) {
        // Perform validation or business logic if needed

        // Publish the event
        eventPublisher.publishEvent(new ReportCreateEvent(createReportCommand.toReportAggregate()));
    }
}

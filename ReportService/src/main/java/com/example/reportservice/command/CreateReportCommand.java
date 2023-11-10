package com.example.reportservice.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Builder
@Data
public class CreateReportCommand {
    @AggregateIdentifier
    private final String reportId;
    private final String name;
    private final String post;
    private final String comment;
}

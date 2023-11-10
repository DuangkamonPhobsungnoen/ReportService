package com.example.reportservice.query.rest;

import com.example.reportservice.core.event.ReportCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReportQueryHandler {
    @EventListener
    public ReportRestModel handle(ReportCreateEvent reportCreateEvent) {
        // Handle the event and return the corresponding ReportRestModel
        // Implement logic to retrieve data from the event and construct ReportRestModel
//        return new ReportRestModel(
//                // Populate fields based on the event data
//        );
    }
}

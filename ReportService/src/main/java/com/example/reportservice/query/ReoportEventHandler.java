package com.example.reportservice.query;

import com.example.reportservice.core.event.ReportCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReportEventHandler {
    @EventListener
    public void handleReportCreateEvent(ReportCreateEvent reportCreateEvent) {
        // Handle the event, e.g., update the read model or perform other actions
    }
}

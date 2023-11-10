package com.example.reportservice.query;

import com.example.reportservice.core.data.ReportEntity;
import com.example.reportservice.core.data.ReportRepository;
import com.example.reportservice.core.events.ReportCreateEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportEventsHandler {
    private final ReportRepository reportRepository;

    @Autowired
    public ReportEventsHandler(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @EventHandler
    public void on(ReportCreateEvent event) {
        System.out.println("Adding Report in mongoDB");
        ReportEntity bookEntity = new ReportEntity();
        BeanUtils.copyProperties(event, bookEntity);
        reportRepository.insert(bookEntity);
    }
}

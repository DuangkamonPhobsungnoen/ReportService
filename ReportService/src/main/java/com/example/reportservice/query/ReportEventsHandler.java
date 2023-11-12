package com.example.reportservice.query;

import com.example.reportservice.core.data.CommentEntity;
import com.example.reportservice.core.data.CommentRepository;
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
    private final CommentRepository commentRepository;

    @Autowired
    public ReportEventsHandler(ReportRepository reportRepository, CommentRepository commentRepository) {
        this.reportRepository = reportRepository;
        this.commentRepository = commentRepository;
    }

    @EventHandler
    public void on(ReportCreateEvent event) {
        System.out.println(event);
        switch (event.getType()){
            case "comment":
                CommentRepository comment = commentRepository.findCommentByCommentId(event.getReportTargetId());
                if(comment == null) {
                    return;
                }
                System.out.println("Adding Report Comment in Mongodb ");
                ReportEntity reportEntity = new ReportEntity();
                BeanUtils.copyProperties(event, reportEntity);
                reportRepository.insert(reportEntity);
                break;
        }
    }
}

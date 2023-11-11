package com.example.reportservice.query;

import com.example.reportservice.core.data.PostEntity;
import com.example.reportservice.core.data.PostRepository;
import com.example.reportservice.core.data.ReportEntity;
import com.example.reportservice.core.data.ReportRepository;
import com.example.reportservice.core.events.ReportCreateEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReportEventsHandler {
    private final ReportRepository reportRepository;
    private final PostRepository postRepository;

    @Autowired
    public ReportEventsHandler(ReportRepository reportRepository, PostRepository postRepository) {
        this.reportRepository = reportRepository;
        this.postRepository = postRepository;
    }

    @EventHandler
    public void on(ReportCreateEvent event) {
        System.out.println(event);
        switch (event.getType()){
            case "post":
                PostEntity post = postRepository.findPostByPostId(event.getReportTargetId());
                if(post == null) {
                    return;
                }
                System.out.println("Adding Report in post => " + post);
                ReportEntity reportEntity = new ReportEntity();
                BeanUtils.copyProperties(event, reportEntity);
                reportRepository.insert(reportEntity);
                break;
        }
    }
}

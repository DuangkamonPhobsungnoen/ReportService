package com.example.reportservice.command.rest;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportCommandController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping(value = "/createReport")
    public String createReport(@RequestBody CreateReportRestModel model) {
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setContentType("application/json");
        rabbitTemplate.convertAndSend("CommentExchange", "addComment", model);
        return "Create Report";
    }

}

package com.example.reportservice.command.rest;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportCommandController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping (value = "/addReport/{type}/{reportTargetId}")
    public String addReport(@PathVariable("type") String type, @PathVariable("reportTargetId") String reportTargetId) {
        CreateReportRestModel model = new CreateReportRestModel();
        model.setType(type);
        model.setReportTargetId(reportTargetId);
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setContentType("application/json");
        Message message = rabbitTemplate.getMessageConverter().toMessage(model, messageProperties);
        rabbitTemplate.convertAndSend("ReportExchange", "addReport", message);
        return "Report";
    }

}

package com.example.reportservice.query.rest;

import com.example.reportservice.query.FindReportsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/query/reports")
public class ReportsQueryController {
//    private final QueryGateway queryGateway;
//
//    public ReportsQueryController(QueryGateway queryGateway) {
//        this.queryGateway = queryGateway;
//    }
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @GetMapping(value = "/getReport")
//    public ArrayList getReport() {
//        MessageProperties messageProperties = new MessageProperties();
//        messageProperties.setContentType("application/json");
//        Object Report = rabbitTemplate.convertSendAndReceive("ReportExchange", "getReport", "");
//        return (ArrayList) Report;
//    }
}


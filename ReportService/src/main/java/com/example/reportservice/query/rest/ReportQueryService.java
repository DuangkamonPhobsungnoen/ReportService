package com.example.reportservice.query.rest;

import com.example.reportservice.query.FindReportsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportQueryService {
//    @Autowired
//    private QueryGateway queryGateway;
//    public ReportQueryService(QueryGateway queryGateway) {
//
//        this.queryGateway = queryGateway;
//    }
//    @RabbitListener(queues = "GetReportQueue")
//    public List<ReportRestModel> getReport() {
//        System.out.println("GET ALL REPORT");
//        FindReportsQuery findReportsQuery = new FindReportsQuery();
//        return queryGateway.query(
//                findReportsQuery,
//                ResponseTypes.multipleInstancesOf(ReportRestModel.class)
//        ).join();
//    }
}

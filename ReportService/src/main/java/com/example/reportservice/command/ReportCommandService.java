package com.example.reportservice.command;

import com.example.reportservice.command.rest.CreateReportRestModel;
import com.example.reportservice.query.FindReportsQuery;
import com.example.reportservice.query.rest.ReportRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ReportCommandService {
    private QueryGateway queryGateway;

    @Autowired
    private final CommandGateway commandGateway;

    @Autowired
    public ReportCommandService(CommandGateway commandGateway, QueryGateway queryGateway) {

        this.commandGateway = commandGateway;
        this.queryGateway = queryGateway;
    }

    @RabbitListener(queues = "AddReportQueue")
    public void createReport(CreateReportRestModel model) {
        System.out.println("ADD REPORT");
        CreateReportCommand command = CreateReportCommand.builder()
                .reportId(UUID.randomUUID().toString())
                .type(model.getType())
                .reportTargetId(model.getReportTargetId())
                .build();

        System.out.println(command);

        try {
            commandGateway.sendAndWait(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RabbitListener(queues = "GetReportQueue")
    public List<ReportRestModel> getReport() {
        System.out.println("GET ALL REPORT");
        FindReportsQuery findReportsQuery = new FindReportsQuery();
        return queryGateway.query(
                findReportsQuery,
                ResponseTypes.multipleInstancesOf(ReportRestModel.class)
        ).join();
    }

}

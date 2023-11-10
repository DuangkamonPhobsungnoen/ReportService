package com.example.reportservice.command;

import com.example.reportservice.command.rest.CreateReportRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReportCommandService {
    @Autowired
    private final CommandGateway commandGateway;

    @Autowired
    public ReportCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @RabbitListener(queues = "AddCommentQueue")
    public void createReport(CreateReportRestModel model) {
        System.out.println("CREATE REPORT");
        CreateReportCommand command = CreateReportCommand.builder()
                .reportId(UUID.randomUUID().toString())
                .name(model.getName())
                .comment(model.getComment())
                .post(model.getPost())
                .build();

        System.out.println(command);

        try {
            commandGateway.sendAndWait(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

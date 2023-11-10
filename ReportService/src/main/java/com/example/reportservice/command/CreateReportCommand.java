package com.example.reportservice.command;
import com.example.reportservice.command.rest.CreateReportRestmodel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateReportCommand {
    private final CreateReportRestmodel createReportRestModel;

//    public ReportAggregate toReportAggregate() {
//        // Convert CreateReportRestModel to ReportAggregate
//        // Implement conversion logic here
////        return new ReportAggregate(
////                // Populate fields based on createReportRestModel
////        );
//    }
}
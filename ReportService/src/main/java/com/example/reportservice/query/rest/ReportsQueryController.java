package com.example.reportservice.query.rest;

import com.example.reportservice.query.FindReportsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query/reports")
public class ReportsQueryController {
    private final QueryGateway queryGateway;

    public ReportsQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping()
    public List<ReportRestModel> getBooks() {
        FindReportsQuery findBooksQuery = new FindReportsQuery();
        return queryGateway.query(
                findBooksQuery,
                ResponseTypes.multipleInstancesOf(ReportRestModel.class)
        ).join();
    }
}


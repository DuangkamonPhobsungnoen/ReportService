package com.example.reportservice.command.rest;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateReportRestModel implements Serializable {
    private String name;
    private String post;
    private String comment;

    public CreateReportRestModel() {}

    public CreateReportRestModel(String name, String post, String comment) {
        this.name = name;
        this.post = post;
        this.comment = comment;
    }
}

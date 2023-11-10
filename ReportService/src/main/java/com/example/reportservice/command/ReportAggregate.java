package com.example.reportservice.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReportAggregate {
    private final int id;
    private final String name;
    private final int reportPostCount;
    private final String post;
    private final int reportCommentCount;
    private final int reportReplyCount;
}
package com.example.reportservice.core.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int reportPostCount;
    private String post;
    private int reportCommentCount;
    private int reportReplyCount;

    // getters/setters
}

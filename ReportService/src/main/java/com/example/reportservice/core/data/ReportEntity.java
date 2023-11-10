package com.example.reportservice.core.data;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("Report")
public class ReportEntity implements Serializable {
    @Id
    private String reportId;
    private String name;
    private String post;
    private String comment;

    public ReportEntity() {}

    public ReportEntity(String reportId, String name, String post, String comment) {
        this.reportId = reportId;
        this.name = name;
        this.post = post;
        this.comment = comment;
    }
}

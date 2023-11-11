package com.example.reportservice.core.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Data
@Document("Post")
public class PostEntity implements Serializable {

    @Id
    private String postId;
    private String userId;
    private Date postDate;
    private String postDetail;
    private String postImage;
    private Integer reportCount;
    private Integer likeCount;
    private Integer commentCount;
    private ArrayList<String> comments;

    public PostEntity() {}
    public PostEntity(String postId, String userId, Date postDate, String postDetail, String postImage, Integer reportCount, Integer likeCount, Integer commentCount, ArrayList<String> comments) {
        this.postId = postId;
        this.userId = userId;
        this.postDate = postDate;
        this.postDetail = postDetail;
        this.postImage = postImage;
        this.reportCount = reportCount;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.comments = comments;
    }
}

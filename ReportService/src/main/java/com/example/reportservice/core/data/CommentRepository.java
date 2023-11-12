package com.example.reportservice.core.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends MongoRepository<CommentEntity, String> {

    @Query(value = "{ '_id' : ?0 }")
    public CommentRepository findCommentByCommentId(String commentId);
}
//@Repository
//public interface CommentRepository extends MongoRepository<CommentEntity, String> {
//
//    @Query(value = "{ '_id' : ?0 }")
//    public CommentEntity findPostByPostId(String postId);
//}

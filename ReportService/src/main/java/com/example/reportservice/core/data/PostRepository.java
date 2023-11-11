package com.example.reportservice.core.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<PostEntity, String> {

    @Query(value = "{ '_id' : ?0 }")
    public PostEntity findPostByPostId(String postId);
}

package com.mamun.jpa.repository;

import com.mamun.jpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {

    @Query("select p from Post p where  p.postId= :postId")
    public Post getByPostId(@Param("postId") int postId);

    @Query("select p.title, u.userName from Post p JOIN p.user u")
    public List<String> getDetails();




}

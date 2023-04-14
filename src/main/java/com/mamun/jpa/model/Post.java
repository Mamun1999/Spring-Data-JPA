package com.mamun.jpa.model;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    private int postId;
    private String title;

    @ManyToOne
    private User user;


    public Post() {
    }

    public Post(int postId, String title) {
        this.postId = postId;
        this.title = title;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", user=" + user +
                '}';
    }
}

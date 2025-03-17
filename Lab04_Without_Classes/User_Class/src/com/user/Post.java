package com.user;

import java.time.LocalDate;

public class Post {
    private LocalDate datePublished;
    private String publisher;
    private String metadata;

    public Post(String publisher, LocalDate datePublished, String metadata) {
        this.metadata = metadata;
        this.publisher = publisher;
        this.datePublished = datePublished;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    protected String getMetadata() {
        return this.metadata;
    }
    public void post() {
        System.out.println("The post was sent!");
    }
}

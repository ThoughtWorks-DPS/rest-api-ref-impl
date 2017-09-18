package com.thoughtworks.dps.restapirefimpl.entities;

public class Article {

    private final String id;
    private final String title;
    private final String body;
    private final User author;
    private final boolean draft;

    public Article(String id, String title, String body, User author, boolean draft) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.draft = draft;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public User getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public boolean isDraft() {
        return draft;
    }

    public Article withDraft(boolean draft) {
        return new Article(this.id, this.title, this.body, this.author, draft);
    }

}
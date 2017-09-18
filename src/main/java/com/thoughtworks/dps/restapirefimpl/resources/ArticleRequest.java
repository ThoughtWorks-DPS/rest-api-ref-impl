package com.thoughtworks.dps.restapirefimpl.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleRequest {

    private final String title;
    private final String body;
    private boolean draft;

    public ArticleRequest(@JsonProperty("title") String title,
                          @JsonProperty("body") String body,
                          @JsonProperty("draft") boolean draft) {

        this.title = title;
        this.body = body;
        this.draft = draft;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public boolean isDraft() {
        return draft;
    }
}
package com.thoughtworks.i0.samples.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private long id;

    @Size(max = 25)
    @NotNull
    private String title;

    @Size(max = 500)
    @NotNull
    private String content;

    private Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

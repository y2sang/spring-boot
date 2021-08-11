package com.sang2.springboot.dto;

import com.sang2.springboot.domain.posts.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class PostsDto {

    @Getter
    public static class Info {
        private Long id;
        private String title;
        private String content;
        private String author;
        private LocalDateTime modifiedDate;

        @Builder
        public Info(Posts entity) {
            this.id = entity.getId();
            this.title = entity.getTitle();
            this.content = entity.getContent();
            this.author = entity.getAuthor();
            this.modifiedDate = entity.getModifiedDate();

        }
    }

    @Getter
    @Builder
    public static class Request {
        private String title;
        private String content;
        private String author;
        public Posts toEntity() {
            return Posts.builder()
                    .title(title)
                    .content(content)
                    .author(author)
                    .build();
        }
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class Response {
        private Info info;
        private int returnCode;
        private String returnMessage;
    }
}

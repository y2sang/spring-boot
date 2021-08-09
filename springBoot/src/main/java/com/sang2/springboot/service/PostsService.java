package com.sang2.springboot.service;

import com.sang2.springboot.domain.posts.Posts;
import com.sang2.springboot.domain.posts.PostsRepository;
import com.sang2.springboot.dto.PostsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsDto.Request postsRequest) {
        return postsRepository.save(postsRequest.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsDto.Request postsRequest) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(postsRequest);
        return id;
    }

    public PostsDto.Response findById(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsDto.Response(new PostsDto.Info(posts), 0, "NO ERROR");
    }

}

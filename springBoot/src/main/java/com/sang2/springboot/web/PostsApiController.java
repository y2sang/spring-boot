package com.sang2.springboot.web;

import com.sang2.springboot.constants.IConstants;
import com.sang2.springboot.dto.PostsDto;
import com.sang2.springboot.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping(IConstants.URI_POSTS)
    public Long save(@RequestBody PostsDto.Request requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping(IConstants.URI_POSTS + "/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsDto.Request requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping(IConstants.URI_POSTS + "/{id}")
    public PostsDto.Response findById(@PathVariable Long id) {
        return null;
    }
}

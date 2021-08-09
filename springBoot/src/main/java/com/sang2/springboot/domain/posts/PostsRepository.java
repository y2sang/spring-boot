package com.sang2.springboot.domain.posts;

import com.sang2.springboot.constants.IConstants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends IConstants, JpaRepository<Posts, Long> {
}

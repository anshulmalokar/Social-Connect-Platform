package com.connections.posts_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connections.posts_service.entity.Post;

import java.util.List;

public interface PostsRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}

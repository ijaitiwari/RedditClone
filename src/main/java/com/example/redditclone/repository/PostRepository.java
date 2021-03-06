package com.example.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redditclone.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

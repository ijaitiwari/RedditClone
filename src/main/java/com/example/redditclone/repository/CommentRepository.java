package com.example.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.redditclone.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

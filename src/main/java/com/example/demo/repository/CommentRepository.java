package com.example.demo.repository;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

// Репозиторий для комментариев
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
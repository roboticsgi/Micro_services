package com.question.Repo;

import com.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueRepo extends JpaRepository<Question,Long> {
    List<Question> findByQuizId(Long quizId);
}

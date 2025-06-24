package com.question.service;

import com.question.entity.Question;

import java.util.List;

public interface QueService {

     Question getOne(Long id);
    List<Question> getAll();

    Question create(Question question);

    List<Question> getQueOfQuiz(Long quizId);




}
